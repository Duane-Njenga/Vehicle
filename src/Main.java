public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan(4, "Electric", "Tesla", "blue", "Model S", 2023,10);
        sedan.gas(40);

        sedan.accelerate();
        sedan.stop();

        SportsCar SC = new SportsCar(2, "Petrol", "Ferrari", "Red", "Model S", 2024,15);
        SC.gas(10);

        SC.accelerate();
        SC.stop();

        Bus bus = new Bus(4, "Diesel", "Tesla", "blue", "Model S", 2023,10);
        bus.gas(40);

        bus.accelerate();
        bus.stop();
        }
    }
}