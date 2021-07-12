package case_study.services;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.utils.ReadAndWriteFileByByteStream;
import case_study.utils.Regex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static boolean check = false;

    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static final String FILE_PATH = "src/case_study/data/customer.csv";
    public static List<Customer> customers = new LinkedList<>();
    Regex regex = new Regex();

    @Override
    public void add() {
        customers = (List<Customer>) new ReadAndWriteFileByByteStream<Customer>().readFileByByteStream(FILE_PATH);
        int id;
        if (customers == null) {
            customers = new LinkedList<>();
            id = 1;
        } else {
            id = customers.get(customers.size() - 1).getId() + 1;
        }
        System.out.print("Enter name: ");
        String name = input().nextLine();
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
        System.out.print("Enter gender: ");
        String sex = input().nextLine();
        System.out.print("Enter citizen ID: ");
        String citizenID = input().nextLine();
        System.out.print("Enter phone number: ");
        String phone = input().nextLine();
        System.out.print("Enter email: ");
        String email = input().nextLine();
        System.out.print("Enter customer ID: ");
        String customerID = input().nextLine();
        System.out.print("Enter customer type: ");
        String customerType = input().nextLine();
        System.out.print("Enter address: ");
        String address = input().nextLine();
        Customer customer = new Customer(id, name, birth, sex, citizenID, phone, email, customerID, customerType, address);
        customers.add(customer);
        new ReadAndWriteFileByByteStream<Customer>().writeFileByByteStream(customers, FILE_PATH);
    }

    @Override
    public void edit() {
        if (customers == null) {
            System.out.println("Customer list is empty");
        } else {
            customers = (List<Customer>) new ReadAndWriteFileByByteStream<Customer>().readFileByByteStream(FILE_PATH);
            System.out.print("Enter customer's id you want to change information: ");
            int id = input().nextInt();
            for (Customer editCustomer : customers) {
                if (id == editCustomer.getId()) {
                    System.out.print("Enter customer new name: ");
                    String newName = input().nextLine();
                    editCustomer.setName(newName);
                    String newBirth = "";
                    while (true) {
                        System.out.print("Enter customer new birthday: ");
                        newBirth = input().nextLine();
                        if (regex.dayOfBirth(newBirth) == true) {
                            break;
                        } else {
                            System.out.println("Pleas enter in DD/MM/YYYY format");
                        }
                    }
                    editCustomer.setBirth(newBirth);
                    System.out.print("Enter customer new gender: ");
                    String newSex = input().nextLine();
                    editCustomer.setSex(newSex);
                    System.out.print("Enter customer new phone number: ");
                    String newPhone = input().nextLine();
                    editCustomer.setPhone(newPhone);
                    System.out.print("Enter customer new email: ");
                    String newEmail = input().nextLine();
                    editCustomer.setEmail(newEmail);
                    System.out.print("Enter customer new type: ");
                    String newCustomerType = input().nextLine();
                    editCustomer.setCustomerType(newCustomerType);
                    System.out.print("Enter customer new address: ");
                    String newAddress = input().nextLine();
                    editCustomer.setAddress(newAddress);
                    check = true;
                    break;
                }
            }
        }
        if (check) {
            System.out.println("Complete update");
            new ReadAndWriteFileByByteStream<Customer>().writeFileByByteStream(customers, FILE_PATH);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        customers = (List<Customer>) new ReadAndWriteFileByByteStream<Customer>().readFileByByteStream(FILE_PATH);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
