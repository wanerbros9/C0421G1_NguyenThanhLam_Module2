package case_study.services;

import _15_exception_debug.thuc_hanh.ArrayExample;
import case_study.models.Customer;
import case_study.models.Employee;
import case_study.models.Facility;
import case_study.utils.ReadAndWriteFileByByteStream;
import case_study.utils.Regex;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    private static boolean check = false;

    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    private static final String FILE_PATH = "src/case_study/data/employee.csv";
    public static List<Employee> employees = new ArrayList<>();
    Regex regex = new Regex();

//    static {
//        employees.add(new Employee("lam", "16/10/1998", "male", "CD1", "0825161098", "lam@gmail.com", "NV1", "Cao dang", "Le tan", 10000));
//        employees.add(new Employee("khoa", "31/10/1998", "male", "CD2", "0825161000", "khoa@gmail.com", "NV2", "Dai hoc", "Quan ly", 12000));
//        employees.add(new Employee("tung", "5/12/1998", "female", "CD3", "0825161111", "tung@gmail.com", "NV3", "Sau dai hoc", "Buong phong", 700));
//    }

    @Override
    public void add() {
        System.out.print("Enter id: ");
        String id = input().nextLine();
        System.out.print("Enter name: ");
        String name = input().nextLine();
        String birth = "";
        while (true) {
            System.out.print("Enter date of birth: ");
            birth = input().nextLine();
            if (!regex.dayOfBirth(birth) == true) {
                break;
            } else {
                System.out.println("Pleas enter in DD/MM/YYYY format");
            }
        }
        System.out.print("Enter gender: ");
        String sex = input().nextLine();
        System.out.print("Enter citizen ID: ");
        String citizenID = input().nextLine();
        System.out.print("Enter phone number: ");
        String phone = input().nextLine();
        System.out.print("Enter email: ");
        String email = input().nextLine();
        System.out.print("Enter employee ID: ");
        String employeeID = input().nextLine();
        System.out.print("Enter your level: ");
        String level = input().nextLine();
        System.out.print("Enter position: ");
        String position = input().nextLine();
        System.out.print("Enter salary: ");
        double salary = input().nextDouble();
        Employee employee = new Employee(id, name, birth, sex, citizenID, phone, email, employeeID, level, position, salary);
        employees.add(employee);
        new ReadAndWriteFileByByteStream<Employee>().writeFileByByteStream(employees, FILE_PATH);
    }

    @Override
    public void edit() {
        System.out.print("Enter employee id you want to change information: ");
        String id = input().nextLine();
        employees = (List<Employee>) new ReadAndWriteFileByByteStream<Employee>().readFileByByteStream(FILE_PATH);
        for (Employee editEmployee : employees) {
            if (editEmployee.getId().equals(id)) {
                System.out.print("Enter employee new name: ");
                String newName = input().nextLine();
                editEmployee.setName(newName);
                String newBirth = "";
                while (true) {
                    System.out.print("Enter employee new birthday: ");
                    newBirth = input().nextLine();
                    if (regex.dayOfBirth(newBirth) == true) {
                        break;
                    } else {
                        System.out.println("Pleas enter in DD/MM/YYYY format");
                    }
                }
                editEmployee.setBirth(newBirth);
                System.out.print("Enter employee new gender: ");
                String newSex = input().nextLine();
                editEmployee.setSex(newSex);
                System.out.print("Enter employee new phone number: ");
                String newPhone = input().nextLine();
                editEmployee.setPhone(newPhone);
                System.out.print("Enter employee new email: ");
                String newEmail = input().nextLine();
                editEmployee.setEmail(newEmail);
                System.out.print("Enter employee new level: ");
                String newLevel = input().nextLine();
                editEmployee.setLevel(newLevel);
                System.out.print("Enter employee new position: ");
                String newPosition = input().nextLine();
                editEmployee.setPosition(newPosition);
                System.out.print("Enter employee new salary: ");
                double newSalary = input().nextDouble();
                editEmployee.setSalary(newSalary);
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Update completed");
            new ReadAndWriteFileByByteStream<Employee>().writeFileByByteStream(employees, FILE_PATH);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        employees = (List<Employee>) new ReadAndWriteFileByByteStream<Employee>().readFileByByteStream(FILE_PATH);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
