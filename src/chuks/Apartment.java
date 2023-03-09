package chuks;

public class Apartment extends Resident{
    private final String apartmentNumber;
    public Apartment(String name, String phoneNum, String address, String apartmentNumber, String city, String state, String zipCode, double monthlyRent) {
        super(name, phoneNum, address,  city, state, zipCode, monthlyRent);
        this.apartmentNumber = apartmentNumber;
    }

    public String toString() {
        return getAddress() + "\n" + "Apt. " + apartmentNumber +  "\n" + getCity() + ", " + getState() + " " + getZipCode();
    }

    public String contactInfo(){
        return "Name: " + getName() + "\n" + "Contact: " + getPhoneNum();
    }

    public double firstPayment() {
        return getMonthlyRent() + APPLICATION_FEE + (getMonthlyRent() / 2);
    }

}
