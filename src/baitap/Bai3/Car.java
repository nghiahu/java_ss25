package baitap.Bai3;

public class Car {
    private String engine;
    private int seats;
    private String color;

    public static class Builder {
        private String engine;
        private int seats;
        private String color;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.engine = this.engine;
            car.seats = this.seats;
            car.color = this.color;
            return car;
        }
    }
    @Override
    public String toString() {
        return "Động cơ: " + engine + " - Ghế: " + seats + " - Màu : " + color;
    }
}
