package case_study.models;

public class Contract {
    private String contractNumber;
    private String bookingCode;
    private double depositMoney;
    private double amountMoney;
    private String customerID;

    public Contract() {
    }

    public Contract(String contractNumber, String bookingCode, double depositMoney, double amountMoney, String customerID) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.depositMoney = depositMoney;
        this.amountMoney = amountMoney;
        this.customerID = customerID;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(double amountMoney) {
        this.amountMoney = amountMoney;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", depositMoney=" + depositMoney +
                ", amountMoney=" + amountMoney +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}
