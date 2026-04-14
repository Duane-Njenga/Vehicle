public abstract class Vehicle {
    private String brand;
    private String color;
    private int yom;

    public Vehicle(String brand, String color, int yom) {
        this.brand =brand;
        this.color =color;
        this.yom =yom;
    }
    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();

    public void displayInfo() {
        System.out.println(yom + " " + brand + " (" + color + ")");
    }

    public String getBrand() { return brand; }
    public String getColor() { return color; }
    public int getYom() { return yom; }
}

