public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String color, String model, int yom, double fuelLevel) {
        super(brand, color, yom, model, fuelLevel);

    }

    @Override
    public void accelerate() {

        System.out.println("Motorcycle accelerate");
    }

    @Override
    public void stop() {

        System.out.println("Motorcycle Brakes Applied");
    }

    @Override
    public void gas(double litres) {
        this.fuelLevel += litres;
        System.out.println("Motorcycle filled by " + litres + "L.");
        System.out.println("Total:" + fuelLevel);

    };
}
