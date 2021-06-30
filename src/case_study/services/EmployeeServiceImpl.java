package case_study.services;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static boolean check = false;

    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("lam", "16/10/1998", "male", "CD1", "0825161098", "lam@gmail.com", "NV1", "Cao dang", "Le tan", 10000));
        employees.add(new Employee("khoa", "31/10/1998", "male", "CD2", "0825161000", "khoa@gmail.com", "NV2", "Dai hoc", "Quan ly", 12000));
        employees.add(new Employee("tung", "5/12/1998", "female", "CD3", "0825161111", "tung@gmail.com", "NV3", "Sau dai hoc", "Buong phong", 700));
    }

    @Override
    public void add() {
        System.out.print("Enter name: ");
        String name = input().nextLine();
        System.out.print("Date of birth: ");
        String birth = input().nextLine();
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
        Employee employee = new Employee(name, birth, sex, citizenID, phone, email, employeeID, level, position, salary);
        employees.add(employee);
    }

    @Override
    public void edit() {
        System.out.print("Enter employee name you want to change information: ");
        String name = input().nextLine();
        for (Employee editEmployee : employees) {
            if (editEmployee.getName().equals(name)) {
                System.out.print("Enter employee new name: ");
                String newName = input().nextLine();
                editEmployee.setName(newName);
                System.out.print("Enter employee new birthday: ");
                String newBirth = input().nextLine();
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
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}