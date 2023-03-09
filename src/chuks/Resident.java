package chuks;

public abstract class Resident {
    private final String address;
    private final String city;
    private final String state;
    private final String zipCode;
    private final double monthlyRent;
    private final String name;
    private final String phoneNum;
    protected final double APPLICATION_FEE = 50.00;


    public Resident(String name, String phoneNum, String address, String city, String state, String zipCode, double monthlyRent) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.monthlyRent = monthlyRent;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public String toString() {
        return address+ "\n" + "Apt. " +  "\n" + city + ", " + state + " " + zipCode;
    }

    public abstract String contactInfo();

    public abstract double firstPayment();
}
