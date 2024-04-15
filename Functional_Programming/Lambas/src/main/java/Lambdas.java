import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        System.out.println("Even numbers:");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);


        System.out.println("Squared numbers:");
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
