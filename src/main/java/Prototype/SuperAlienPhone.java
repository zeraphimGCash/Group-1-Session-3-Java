package Prototype;

public class SuperAlienPhone extends SuperPhoneModel {
    private String phone;
    private String alienPhone = "Apple"; // by default

    public SuperAlienPhone() {

        this.phone = DatabasePhone.getPhone(); // costly operation
    }

    public void setPhone(String name) {

        this.alienPhone = name;
    }

    public void getDetails() {
        System.out.println("Phone Brand: " + this.alienPhone);
    }

    public void phoneSpecs() {
        // Arrays for phone details
        String[][] phoneDetails = {
                {"iPhone 15", "iPhone 15 Pro", "iPhone 15 Pro Max"},
                {"64GB", "128GB", "256GB", "512GB"},
                {"Black", "White", "Red", "Blue"},
                {"Samsung Galaxy S24", "Samsung Galaxy S24 Ultra", "Samsung Galaxy Z Fold6"},
                {"128GB", "256GB", "512GB"},
                {"Phantom Gray", "Phantom White", "Phantom Pink", "Phantom Silver"}
        };
        int modelIndex = -1, storageIndex = -1, colorIndex = -1;

        if (alienPhone == "Apple") {
            modelIndex = 0;
            storageIndex = 1;
            colorIndex = 2;
        } else if (alienPhone == "Samsung") {
            modelIndex = 3;
            storageIndex = 4;
            colorIndex = 5;
        }
        System.out.println("\nPhone Models Available:");
        for (String model : phoneDetails[modelIndex]) {
            System.out.println("- " + model);
        }
        System.out.println("\nStorage Options:");
        for (String storage : phoneDetails[storageIndex]) {
            System.out.println("- " + storage);
        }
        System.out.println("\nColors Available:");
        for (String color : phoneDetails[colorIndex]) {
            System.out.println("- " + color);
        }

    }
}
