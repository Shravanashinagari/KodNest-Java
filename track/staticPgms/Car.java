package track.staticPgms;

class Car {
    static void convertKmsToMiles() {
        System.out.println("Converting kms to miles");
    }

    void calculateMileage() {
        System.out.println("Calculating mileage");
    }

    public static void main(String[] args) {
        Car.convertKmsToMiles();

        Car benzCar = new Car();
        benzCar.calculateMileage();

        Car BMW = new Car();
        BMW.calculateMileage();
    }
}
