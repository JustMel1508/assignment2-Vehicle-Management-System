public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, Driver driver, boolean hasSidecar) {
        super(brand, year, driver);
        this.hasSidecar = hasSidecar;
    }

    public void startEngine() {
        System.out.println("Motorcycle " + brand + ": Engine is running.");
    }

    public void stopEngine() {
        System.out.println("Motorcycle " + brand + ": Engine is off.");
    }
}
