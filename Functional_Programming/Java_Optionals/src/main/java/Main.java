import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalOf = Optional.of("Hello");
        Optional<String> optionalNullable = Optional.ofNullable(null);

        System.out.println("Value is present: " + optionalOf.get());

        String orElseExample = optionalNullable.orElse("Default Value");
        System.out.println("orElse example: " + orElseExample);

        Optional<Integer> optionalLength = optionalOf.map(String::length);
        optionalLength.ifPresent(System.out::println);

        Supplier<String> supplier = () -> "Supplied Value";
        String orElseGetExample = optionalEmpty.orElseGet(supplier);
        System.out.println("orElseGet example: " + orElseGetExample);
    }
}
