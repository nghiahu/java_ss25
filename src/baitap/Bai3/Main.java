package baitap.Bai3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder().setEngine("V8").setSeats(2).setColor("Red").build();
        Car car2 = new Car.Builder().setEngine("V12").setSeats(3).setColor("Blue").build();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
