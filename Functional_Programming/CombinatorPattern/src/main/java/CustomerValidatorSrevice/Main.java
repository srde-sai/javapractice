package CustomerValidatorSrevice;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Aysha", "abc@gmail.com", "+91987654", LocalDate.of(1999, 1, 3));


        System.out.println(new CustomerValidatorSrevice().isValid(customer));


    }
}
