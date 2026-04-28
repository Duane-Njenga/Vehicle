public abstract class Vehicle {
    protected String brand;
    protected String color;
    protected int yom;
    protected String model;
    protected double fuelLevel;

    public Vehicle(String brand, String color, int yom, String model, double fuelLevel) {
        this.brand =brand;
        this.color =color;
        this.yom =yom;
        this.model =model;
        this.fuelLevel = fuelLevel;
    }
    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas(double litres);

    public void displayInfo() {
        System.out.println(yom + " " + brand + " (" + color + ")");
    }

    public String getBrand() { return brand; }
    public String getColor() { return color; }
    public int getYom() { return yom; }
}

