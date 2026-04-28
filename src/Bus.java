public class Bus extends Vehicle {
    protected int passengerCapacity;

    public Bus(String brand, String model, int yom,double fuelLevel, int passengerCapacity) {
        super(brand, model, yom, fuelLevel);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void accelerate() {
        System.out.println("Bus accelerates from bus stop");
    }

    @Override
    public void stop() {
        System.out.println("Bus applies air brakes ans stops at the bus stop.");
    }

    @Override
    public void gas(double litres) {
        this.fuelLevel += litres;
        System.out.println("Bus filled by " + litres + "L.");
        System.out.println("Total:" + fuelLevel);    }
}