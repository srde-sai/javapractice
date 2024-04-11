package com.srdesai;

import java.time.LocalDate;

public class PassportExample_practice {
    public static void main(String[] args) {
        Passport indianPassport = new Passport("12345", "India", LocalDate.of(2029, 8, 9) );
        Passport usPassport = new Passport("12346", "USA", LocalDate.of(2030, 7, 11));
        Passport ukPassport = new Passport("54321", "UK", LocalDate.of(2028, 2, 24));

        System.out.println("Indian Passport Number: " + indianPassport.getNumber());
        System.out.println("US Passport Country: " + usPassport.getCountry());
        System.out.println("UK Passport Expiry Date: " + ukPassport.getExpDate());

    }

    static class Passport{
        String number;
        String country;
        LocalDate expDate;

        Passport(String num, String cntry, LocalDate eDate) {
            this.number = num;
            this.country = cntry;
            this.expDate = eDate;
        }

        public String getNumber() {
            return number;
        }

        public String getCountry() {
            return country;
        }

        public LocalDate getExpDate() {
            return expDate;
        }



    }
}
