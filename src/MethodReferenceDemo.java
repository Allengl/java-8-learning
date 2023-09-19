import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        // 1. 静态方法引用
        // Integer::parseInt 等价于 (s) -> Integer.parseInt(s)
        List<String> nums = Arrays.asList("1", "2", "3", "4");
        List<Integer> ints = nums.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(ints);

        //2. 实例方法引用
        Car car = new Car();
        IntConsumer intConsumer = car::setSpeed;
        intConsumer.accept(100);
        System.out.println(car.getSpeed());

        List<Integer> lengthList = nums.stream()
                .map(String::length)
                .collect(Collectors.toList());

        List<Car> carList = new ArrayList<>();
        List<Integer> speedList = carList.stream()
                .map(Car::getSpeed)
                .collect(Collectors.toList());
        //3. 构造方法引用

        //无参数构造器
        Supplier<Car> carSupplier = Car::new;
        car = carSupplier.get();

        // 有参数构造器. 传入一个Integer参数
        Function<Integer, Car> carFunction = Car::new;
        Car car3 = carFunction.apply(100);

        // 引用接收两个参数的构造器
        HashMap<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> mapBiConsumer = map::put;
        mapBiConsumer.accept("A", 1);
        System.out.println(map);

        // 多参数构造器的方法引用
        BiFunction<String, Integer, Car> carBiFunction = Car::new;
        Car newCar = carBiFunction.apply("BMW", 100);
        System.out.println(newCar.getBrand() + ":" + newCar.getSpeed());



    }
}

