package CustomerValidatorSrevice;


import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorSrevice {
    private boolean isEmailValid (String Email) {
        return Email.contains("@");
    }

    private boolean isPhNumValid(String phnum) {
        return phnum.startsWith("+91");
    }

    private boolean isAdult (LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid (Customer customer) {
        return isEmailValid(customer.getEmail()) && isAdult(customer.getDob());
    }
}
