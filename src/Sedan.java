public class Sedan implements Automobile extends Vehicle{
    int numDoors;
    private String engineType;

    public Sedan(int numDoors, String engineType, String brand, String color, String model, int yom, double fuelLevel) {
        super(brand, model, yom, fuelLevel);
        this.numDoors = numDoors;
        this.engineType = engineType;


    }
    public void accelerate() {
        System.out.println("Sedan accelerates.");
    }
    public void stop() {
        System.out.println("Sedan brakes gently and stops.");
    }
    public void gas(double litres) {
        this.fuelLevel += litres;
        System.out.println("Bus filled by " + litres + "L.");
        System.out.println("Total:" + fuelLevel);    }
    @Override
    public int getDoors(){
        System.out.println("Number of Doors: " + numDoors);
        return 0;
    };
    @Override
    public String getEngineType(){
        System.out.println("Engine Type: " + engineType);
        return null;
    };
    @Override
    public void startEngine(){
        System.out.println("Engine Started.");
        };

    @Override
    public void stopEngine() {

    System.out.println("Engine Off.");
    };
    @Override
    public void hoot(){
        System.out.println("Beep! Beep!");
    };
}
