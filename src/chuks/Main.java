package chuks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Resident apartment = new Apartment("name1", "0709-678-87", "No 4 agbado", "54", "osubi", "Delta state", "6794", 1200);
        Resident house = new House("name2", "0609-902-81", "No 94 silver ", "warri", "Edo state", "9124", 3200);
        ArrayList<Resident> residence = new ArrayList<>();
        residence.add(apartment);
        residence.add(house);

        for(Resident residences : residence){
            if (residences instanceof Apartment){
                System.out.println("Apartment: \n");
            }else if (residences instanceof House) {
                System.out.println("House: \n");
            }
            System.out.println(residences.contactInfo());
            System.out.println(residences);
            System.out.printf("Payment Made: " + "$%,.2f\n", residences.firstPayment());
        }

    }
}