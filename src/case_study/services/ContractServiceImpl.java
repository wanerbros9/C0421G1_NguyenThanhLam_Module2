package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.utils.ReadAndWriteFileByByteStream;

import java.util.*;

public class ContractServiceImpl extends ReadAndWriteFileByByteStream implements ContractService{

    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static Queue<Booking> bookings = new LinkedList<>();
    public static List<Contract> contracts = new ArrayList<>();

    public static final String FILE_PATH_BOOKING = "src/case_study/data/booking.csv";
    public static final String FILE_PATH_CONTRACT = "src/case_study/data/contract.csv";


    @Override
    public void add() {
        TreeSet<Booking> bookingTreeSet = new TreeSet<>();
        bookingTreeSet = (TreeSet<Booking>) new ReadAndWriteFileByByteStream<Booking>().readFileByByteStream(FILE_PATH_BOOKING);
        bookings.addAll(bookingTreeSet);
        contracts = (List<Contract>) new ReadAndWriteFileByByteStream<Contract>().readFileByByteStream(FILE_PATH_BOOKING);
        while (!bookings.isEmpty()){
            if (bookings.isEmpty()){
                System.out.println("Booking list is empty");
                break;
            }
            Booking booking = bookings.poll();
            System.out.println("Enter id contract");
            String id = input().nextLine();
            String idBooking = booking.getBookingID();
            System.out.println("Enter deposit amount");
            double depositAmount = input().nextDouble();
            System.out.println("Enter total amount");
            double totalAmount = input().nextDouble();
            String idGuest = booking.getCustomerID();
            Contract contract = new Contract(id, idBooking, depositAmount, totalAmount, idGuest);
            contracts.add(contract);
        }
        new ReadAndWriteFileByByteStream<Contract>().writeFileByByteStream(contracts, FILE_PATH_CONTRACT);
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
