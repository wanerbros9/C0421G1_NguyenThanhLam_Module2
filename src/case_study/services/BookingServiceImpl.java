package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Employee;
import case_study.models.Facility;
import case_study.utils.ReadAndWriteFileByByteStream;
import case_study.utils.Regex;

import java.util.*;

public class BookingServiceImpl extends ReadAndWriteFileByByteStream implements BookingService {

    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static Regex regex = new Regex();
    public static TreeSet<Booking> bookings = new TreeSet<>();
    public static List<Customer> customers = new LinkedList<>();
    public static Map<Facility, Integer> facilities = new LinkedHashMap<>();

    public static final String FILE_PATH_BOOKING = "src/case_study/data/booking.csv";
//    public static final String FILE_PATH_CUSTOMER = "src/case_study/data/customer.csv";
//    public static final String FILE_PATH_FACILITY = "src/case_study/data/facility.csv";

    @Override
    public void add() {
        bookings = (TreeSet<Booking>) new ReadAndWriteFileByByteStream<Booking>().readFileByByteStream(FILE_PATH_BOOKING);
        if (bookings == null) {
            bookings = new TreeSet<>();
        }
        System.out.println("Customer List: ");
        new CustomerServiceImpl().display();
        System.out.println("Facility List: ");
        new FacilityServiceImpl().display();
        System.out.print("Enter booking code: ");
        String bookingCode = input().nextLine();
        String startDate = "";
        while (true) {
            System.out.print("Enter start date: ");
            startDate = input().nextLine();
            if (!regex.dayOfBirth(startDate)) {
                System.out.println("Please enter in DD/MM/YYYY format");
            } else {
                break;
            }
        }
        String endDate = "";
        while (true) {
            System.out.print("Enter end date: ");
            endDate = input().nextLine();
            if (!regex.dayOfBirth(endDate)) {
                System.out.println("Please enter in DD/MM/YYYY format");
            } else {
                break;
            }
        }
        System.out.print("Enter customer id: ");
        String customerId = input().nextLine();
        System.out.print("Enter service name: ");
        String serviceName = input().nextLine();
        System.out.print("Enter service type: ");
        String serviceType = input().nextLine();
        Booking booking = new Booking(bookingCode, startDate, endDate, customerId, serviceName, serviceType);
        bookings.add(booking);
        new ReadAndWriteFileByByteStream<Booking>().writeFileByByteStreamUseTreeSet(bookings, FILE_PATH_BOOKING);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        bookings = (TreeSet<Booking>) readFileByByteStream(FILE_PATH_BOOKING);
        if (bookings == null) {
            System.out.println("List is empty");
        } else {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }
}
