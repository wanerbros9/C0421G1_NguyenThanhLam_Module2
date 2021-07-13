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
        employees = (List<Employee>) new ReadAndWriteFileByByteStream<Employee>().readFileByByteStream(FILE_PATH);
        int id;
        if (employees == null) {
            employees = new ArrayList<>();
            id = 1;
        } else {
            id = employees.get(employees.size() - 1).getId() + 1;
        }
        String name = "";
        while (true) {
            System.out.print("Enter name: ");
            name = input().nextLine();
            if (regex.whiteSpace(name) == true) {
                break;
            } else {
                System.out.println("You must enter name");
            }
        }
        String birth = "";
        while (true) {
            System.out.print("Enter date of birth: ");
            birth = input().nextLine();
            if (regex.dayOfBirth(birth) == true) {
                break;
            } else {
                System.out.println("Pleas enter in DD/MM/YYYY format");
            }
        }
        String sex = "";
        while (true) {
            System.out.print("Enter gender: ");
            sex = input().nextLine();
            if (regex.whiteSpace(sex) == true) {
                break;
            } else {
                System.out.println("You must enter gender");
            }
        }
        String citizenID = "";
        while (true) {
            System.out.print("Enter citizen ID: ");
            citizenID = input().nextLine();
            if (regex.whiteSpace(citizenID) == true) {
                break;
            } else {
                System.out.println("You must enter citizen ID");
            }
        }
        String phone = "";
        while (true) {
            System.out.print("Enter phone number: ");
            phone = input().nextLine();
            if (regex.whiteSpace(phone) == true) {
                break;
            } else {
                System.out.println("You must enter phone number");
            }
        }
        String email = "";
        while (true) {
            System.out.print("Enter email: ");
            email = input().nextLine();
            if (regex.whiteSpace(email) == true) {
                break;
            } else {
                System.out.println("You must enter email");
            }
        }
        String level = "";
        while (true) {
            System.out.print("Enter your level: ");
            level = input().nextLine();
            if (regex.whiteSpace(level) == true) {
                break;
            } else {
                System.out.println("You must enter level");
            }
        }
        String position = "";
        while (true) {
            System.out.print("Enter position: ");
            position = input().nextLine();
            if (regex.whiteSpace(position) == true) {
                break;
            } else {
                System.out.println("You must enter position");
            }
        }
        double salary = 0;
        while (true) {
            System.out.print("Enter salary: ");
            salary = input().nextDouble();
            String str = String.valueOf(salary);
            if (regex.whiteSpace(str) == true) {
                break;
            } else {
                System.out.println("You must enter salary");
            }
        }
        Employee employee = new Employee(id, name, birth, sex, citizenID, phone, email, level, position, salary);
        employees.add(employee);
        new ReadAndWriteFileByByteStream<Employee>().writeFileByByteStream(employees, FILE_PATH);
    }

    @Override
    public void edit() {
        if (employees == null) {
            System.out.println("Employee list is empty");
        } else {
            System.out.print("Enter employee id you want to change information: ");
            int id = input().nextInt();
            employees = (List<Employee>) new ReadAndWriteFileByByteStream<Employee>().readFileByByteStream(FILE_PATH);
            for (Employee editEmployee : employees) {
                if (id == editEmployee.getId()) {
                    String newName = "";
                    while (true) {
                        System.out.print("Enter employee new name: ");
                        newName = input().nextLine();
                        if (regex.whiteSpace(newName)==true){
                            break;
                        }else {
                            System.out.println("You must enter new name");
                        }
                    }
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
                    String newSex = "";
                    while (true) {
                        System.out.print("Enter employee new gender: ");
                        newSex = input().nextLine();
                        if (regex.whiteSpace(newSex) == true) {
                            break;
                        } else {
                            System.out.println("You must enter new gender");
                        }
                    }
                    editEmployee.setSex(newSex);
                    String newPhone = "";
                    while (true) {
                        System.out.print("Enter employee new phone number: ");
                        newPhone = input().nextLine();
                        if (regex.whiteSpace(newPhone) == true) {
                            break;
                        } else {
                            System.out.println("You must enter new phone number");
                        }
                    }
                    editEmployee.setPhone(newPhone);
                    String newEmail = "";
                    while (true) {
                        System.out.print("Enter employee new email: ");
                        newEmail = input().nextLine();
                        if (regex.whiteSpace(newEmail) == true) {
                            break;
                        } else {
                            System.out.println("You must enter new email");
                        }
                    }
                    editEmployee.setEmail(newEmail);
                    String newLevel = "";
                    while (true) {
                        System.out.print("Enter employee new level: ");
                        newLevel = input().nextLine();
                        if (regex.whiteSpace(newLevel) == true) {
                            break;
                        } else {
                            System.out.println("You must enter new level");
                        }
                    }
                    editEmployee.setLevel(newLevel);
                    String newPosition = "";
                    while (true) {
                        System.out.print("Enter employee new position: ");
                        newPosition = input().nextLine();
                        if (regex.whiteSpace(newPosition) == true) {
                            break;
                        } else {
                            System.out.println("You must enter new position");
                        }
                    }
                    editEmployee.setPosition(newPosition);
                    double newSalary;
                    while (true) {
                        System.out.print("Enter employee new salary: ");
                        newSalary = input().nextDouble();
                        String str = String.valueOf(newSalary);
                        if (regex.whiteSpace(str) == true) {
                            break;
                        } else {
                            System.out.println("You must enter new salary");
                        }
                    }
                    editEmployee.setSalary(newSalary);
                    check = true;
                    break;
                }
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
