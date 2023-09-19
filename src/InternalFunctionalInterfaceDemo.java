import java.time.LocalDate;
import java.util.function.*;

public class InternalFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Predicate 接口
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(99));
        BiPredicate<Integer, Integer> isGreater = (n1, n2) -> n1 > n2;
        System.out.println(isGreater.test(100, 99));

        // Function接口 y = f(x)
        Function<String, Integer> stringLength = (s) -> s.length();
        Function<Integer, Integer> square = (n) -> n * n;
        System.out.println(stringLength.apply("Hello World"));
        Function<String, Integer> stringLengthSquare = stringLength.andThen(square);
        System.out.println(stringLengthSquare.apply("Hello World"));

        UnaryOperator<Integer> square2 = (n) -> n * n;
        System.out.println(square2.apply(10));

        BinaryOperator<Integer> add = (n1, n2) -> n1 + n2;
        System.out.println(add.apply(10, 20));
        // Consumer接口
        Consumer<String> printUpperCase = (s) -> System.out.println(s.toUpperCase());
        printUpperCase.accept("Hello World");
        BiConsumer<String, String> printConcat = (s1, s2) -> System.out.println(s1 + s2);
        printConcat.accept("Hello", "World");

        // Supplier接口
        Supplier<String> randomUUID = () -> java.util.UUID.randomUUID().toString();
        System.out.println(randomUUID.get());
        Supplier<LocalDate> currentDate = () -> LocalDate.now();
        System.out.println(currentDate.get());
    }
}
