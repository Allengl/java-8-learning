public class Car {

    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    public Car(Integer integer) {
    }

    public Car(String brand, Integer speed) {
        this.setBrand(brand);
        this.setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    int startCar(int speed) {
        System.out.println("Car started");
        this.setSpeed(speed);
        return speed;
    }

    public Car() {
    }
}
