package case_study.models;

import java.io.Serializable;

public class Booking implements Comparable<Booking>, Serializable {
    private static final long serialVersionUID = 8146614356296966760L;
    private String bookingID;
    private String startDate;
    private String endDate;
    private String customerID;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(String bookingID, String startDate, String endDate, String customerID, String serviceName, String serviceType) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingCode) {
        this.bookingID = bookingCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerID='" + customerID + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        if (this.getStartDate().equals(o.getStartDate())){
            return this.getEndDate().compareTo(o.getEndDate());
        }
        return this.getStartDate().compareTo(o.getStartDate());
    }
}
