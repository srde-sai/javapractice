package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);
        int a = incByOneFunc.apply(3);
        System.out.println("incbyonefunc: " + a);

        int b = mulByTenFunc.apply(a);
        System.out.println("After Mul: " + b);

        Function<Integer, Integer> addby1andthenmulby10 = incByOneFunc.andThen(mulByTenFunc);

        int c = addby1andthenmulby10.apply(2);

        System.out.println(c);

    }

    static Function<Integer, Integer> incByOneFunc =
            num -> num + 1;

    static Function<Integer, Integer> mulByTenFunc =
            n -> n * 10;

    static int increment (int num) {
        return  num + 1;
    }
}
