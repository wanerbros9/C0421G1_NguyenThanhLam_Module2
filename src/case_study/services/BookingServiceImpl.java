package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.utils.ReadAndWriteFileByByteStream;

import java.util.*;

public class BookingServiceImpl extends ReadAndWriteFileByByteStream implements BookingService {

    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static TreeSet<Booking> bookings = new TreeSet<>();
    public static final String FILE_PATH_BOOKING = "src/case_study/data/customer.csv";
//    public static final String FILE_PATH_CUSTOMER = "src/case_study/data/customer.csv";
//    private static ReadAndWriteFileByByteStream<Booking> readAndWriteFileByByteStream = new ReadAndWriteFileByByteStream<>();

    @Override
    public void add() {
        bookings = (TreeSet<Booking>) new ReadAndWriteFileByByteStream<Booking>().readFileByByteStream(FILE_PATH_BOOKING);
        if (bookings == null){
            bookings = new TreeSet<>();
        }
        System.out.println("Customer List: ");
        new CustomerServiceImpl().display();
        System.out.println("Facility List: ");
        new FacilityServiceImpl().display();
        System.out.print("Enter booking code: ");
        String bookingCode = input().nextLine();
        System.out.print("Enter start date: ");
        String startDate = input().nextLine();
        System.out.print("Enter end date: ");
        String endDate = input().nextLine();
        System.out.print("Enter customer id: ");
        String customerId = input().nextLine();
        System.out.print("Enter service name: ");
        String serviceName = input().nextLine();
        System.out.print("Enter service type: ");
        String serviceType = input().nextLine();
        Booking booking = new Booking(bookingCode, startDate, endDate, customerId, serviceName, serviceType);
        bookings.add(booking);
        new ReadAndWriteFileByByteStream<Booking>().writeFileByByteStreamUseTreeSet(bookings,FILE_PATH_BOOKING);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
//        customers = (List<Customer>) new ReadAndWriteFileByByteStream<Booking>().readFileByByteStream(FILE_PATH_CUSTOMER);
//        for (Customer customer : customers) {
//            System.out.println("Customer id: " + customer.getCustomerID() + ", Customer name: " + customer.getName());
//        }
    }
}
