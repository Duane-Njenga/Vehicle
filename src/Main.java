public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan(4, "Electric", "Tesla", "blue", "Model S", 2023,10);
        sedan.gas(40);
        //Overriding
        sedan.accelerate();

        //Overloading
        sedan.accelerate(180);
        sedan.stop();





    }
}