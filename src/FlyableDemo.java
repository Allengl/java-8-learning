public class FlyableDemo {

    public static void main(String[] args) {

        // 1. 新建一个类，然后实例化
        Bird bird = new Bird();
        int birdSpeed =  bird.fly();
        System.out.println("Bird speed: " + birdSpeed);

        // 2. 匿名内部类
        Flyable flying = new Flyable() {
            @Override
            public int fly() {
                System.out.println("I am flying");
                return 1000;
            }
        };
        int thingSpeed =  flying.fly();
        System.out.println("Thing speed: " + thingSpeed);

        // 3. Lambda表达式
        Flyable flight = () -> {
            System.out.println("Flight flying");
            return 1000;
        };
        int flightSpeed =  flight.fly();
        System.out.println("Flight speed: " + flightSpeed);
    }



}

class Bird implements Flyable {
    @Override
    public int fly() {
        System.out.println("Bird flying");
        return 10;
    }
}

