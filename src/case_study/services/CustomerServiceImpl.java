package case_study.services;

import case_study.models.Customer;

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

    public static List<Customer> customers = new LinkedList<>();

    static {
        customers.add(new Customer("lam", "16/10/1998", "male", "CD2", "0825161098", "lam@gmail.com", "K1", "Vip", "Da Nang"));
        customers.add(new Customer("khoa", "31/10/1998", "male", "CD67", "0825161000", "khoa@gmail.com", "K2", "Platinum", "Hue"));
        customers.add(new Customer("tung", "5/12/1998", "female", "CD123", "0825161111", "tung@gmail.com", "K3", "Diamond", "Vinh"));
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
        System.out.print("Enter customer ID: ");
        String customerID = input().nextLine();
        System.out.print("Enter customer type: ");
        String customerType = input().nextLine();
        System.out.print("Enter address: ");
        String address = input().nextLine();
        Customer customer = new Customer(name, birth, sex, citizenID, phone, email, customerID, customerType, address);
        customers.add(customer);
    }

    @Override
    public void edit() {
        System.out.print("Enter customer name you want to change information: ");
        String name = input().nextLine();
        for (Customer editCustomer : customers) {
            if (editCustomer.getName().equals(name)) {
                System.out.print("Enter customer new name: ");
                String newName = input().nextLine();
                editCustomer.setName(newName);
                System.out.print("Enter customer new birthday: ");
                String newBirth = input().nextLine();
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

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        for (Customer customer : customers) {
            if (customer != null) {
                System.out.println(customer);
            }
        }
    }
}