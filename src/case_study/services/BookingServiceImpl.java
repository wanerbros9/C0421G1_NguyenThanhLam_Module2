package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.utils.ReadAndWriteFileByByteStream;

import java.util.*;

public class BookingServiceImpl extends ReadAndWriteFileByByteStream implements BookingService {
    private static Set<Booking> bookings = new TreeSet<>();

    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    @Override
    public void add() {
        System.out.println("Customer List");
        new CustomerServiceImpl().display();
        System.out.println("Facility List");
        new FacilityServiceImpl().display();
        System.out.print("Enter customer id: ");
        int idChoice = input().nextInt();
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }
}
