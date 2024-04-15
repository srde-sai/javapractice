package CustomerValidatorSrevice;

import java.time.LocalDate;

public class Customer {
    private final String Name;

    public String getEmail() {
        return email;
    }

    private final String email;
    private final String phonenumber;
    private final LocalDate dob;

    public LocalDate getDob() {
        return dob;
    }

    public String getPhonenumber() {
        return phonenumber;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", dob=" + dob +
                '}';
    }

    public String getName() {
        return Name;
    }

    public Customer(String name, String email, String phonenumber, LocalDate dob) {
        this.Name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.dob = dob;




    }
}
