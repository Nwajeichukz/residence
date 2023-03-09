package chuks;

public class House extends Resident {
    public House(String name, String phoneNum,String address,  String city, String state, String zipCode, double monthlyRent) {
        super(name, phoneNum, address, city, state, zipCode, monthlyRent);

    }

    public String contactInfo(){
        return "Name: " + getName() + "\n" + "Contact: " + getPhoneNum();
    }

    public double firstPayment() {
        double SECURITY_DEPOSIT = 1000.00;
        return getMonthlyRent() + APPLICATION_FEE + SECURITY_DEPOSIT;
    }


}
