package Prototype;

public class SuperAlienCar extends SuperCarPlan {
    private String planet;
    private String alienDriver = "Lalamove"; // by default
    public SuperAlienCar() {
        this.planet = DatabasePlanet.getPlanet(); // costly operation
    }
    public void setDriver(String name) {
        this.alienDriver = name;
    }
    public void getDetails() {

        System.out.println("driver name is " + this.alienDriver);
    }
    public String toString(){
        return "test";
    }
}
