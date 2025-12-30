public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Алихан Смаилов", "889|05");
        Driver d2 = new Driver("Гульнара Асанова", "452|02");
        Driver d3 = new Driver("Берик Куанышев", "110|01");

        Car car = new Car("Hyundai", 2022, d1, 4, "Бензин");
        Motorcycle bike = new Motorcycle("BMW", 2021, d2, false);
        Truck truck = new Truck("KamAZ", 2018, d3, 15.0, 3);
        ElectricCar tesla = new ElectricCar("Tesla Model 3", 2023, d1, 4, 75);

        Vehicle[] vehicles = {car, bike, truck, tesla};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            vehicles[i].startEngine();
            vehicles[i].stopEngine();
            System.out.println("     ");
        }
    }
}