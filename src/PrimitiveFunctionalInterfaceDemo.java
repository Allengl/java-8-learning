import java.util.function.IntPredicate;

public class PrimitiveFunctionalInterfaceDemo {
    public static void main(String[] args) {
        IntPredicate isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(99));
    }
}
