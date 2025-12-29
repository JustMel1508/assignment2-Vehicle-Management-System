public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Асхат Мұратұлы", "KZ8800");
        Driver d2 = new Driver("Динара Қасым", "KZ9911");

        Car car = new Car("Hyundai", 2022, d1, 4, "Petrol");
        Motorcycle bike = new Motorcycle("Yamaha", 2020, d2, false);
        Truck truck = new Truck("Kamaz", 2018, d1, 15.5, 3);

        Vehicle[] vehicles = {car, bike, truck};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            vehicles[i].startEngine();
            vehicles[i].stopEngine();
        }
    }
}