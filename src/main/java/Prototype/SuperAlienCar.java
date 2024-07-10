package Prototype;

public class SuperAlienCar extends SuperPhoneModel {
    private String phone;
    private String alienDriver = "Lalamove"; // by default
    public SuperAlienCar() {
        this.phone = DatabasePhone.getPhone(); // costly operation
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
