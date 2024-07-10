package Prototype;

public class SuperAlienPhone extends SuperPhoneModel {
    private String phone;
    private String alienPhone = "Lalamove"; // by default
    public SuperAlienPhone() {

        this.phone = DatabasePhone.getPhone(); // costly operation
    }
    public void setDriver(String name) {

        this.alienPhone = name;
    }
    public void getDetails() {

        System.out.println("driver name is " + this.alienPhone);
    }
    public String toString(){

        return "test";
    }
}
