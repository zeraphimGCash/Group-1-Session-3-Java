package Prototype;

import java.util.Scanner;

public class SuperAlienPhone extends SuperPhoneModel {
    private String phone;
    private String alienPhone = "Apple"; // by default
    private String[][] phoneDetails = {};

    public SuperAlienPhone() {
        this.phone = DatabasePhone.getPhone();// costly operation
        this.phoneDetails = new String[][]{
                {"iPhone 15", "iPhone 15 Pro", "iPhone 15 Pro Max"},
                {"64GB", "128GB", "256GB", "512GB"},
                {"Black", "White", "Red", "Blue"},
                {"Samsung Galaxy S24", "Samsung Galaxy S24 Ultra", "Samsung Galaxy Z Fold6"},
                {"128GB", "256GB", "512GB"},
                {"Phantom Gray", "Phantom White", "Phantom Pink", "Phantom Silver"},
                {"Nokia 3310", "Nokia 105", "Nokia 150"},
                {"8MB", "4MB", "16MB"},
                {"Black", "Blue", "Red", "Yellow"},
                {"Samsung Guru", "Samsung Metro", "Samsung Keystone"},
                {"2MB", "4MB", "8MB"},
                {"Black", "White", "Blue"},
                {"Motorola F3", "Motorola W175", "Motorola C168"},
                {"2MB", "4MB", "8MB"},
                {"Black", "Silver", "Red"}
        };
    }
    public void setPhone(String name) {
        this.alienPhone = name;
    }
    public void getDetailsCoolPhone() {
        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter phone brand (Apple or Samsung): ");
        String userInput = scanner.nextLine().trim();

        alienPhone = userInput;

        System.out.println("Phone Brand: " + this.alienPhone);

        // Arrays for phone details

        int modelIndex = -1, storageIndex = -1, colorIndex = -1;

        if (this.alienPhone.equals("Apple")) {
            modelIndex = 0;
            storageIndex = 1;
            colorIndex = 2;
        } else if (this.alienPhone.equals("Samsung")) {
            modelIndex = 3;
            storageIndex = 4;
            colorIndex = 5;
        }

        // Check if a valid phone brand was entered
        if (modelIndex != -1) {
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
        } else {
            System.out.println("Invalid phone brand entered.");
        }



    }
    public void getDetailsKeypadPhone() {
        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter phone brand (Nokia/Samsung/Motorola): ");
        String userInput = scanner.nextLine().trim();

        alienPhone = userInput;
        System.out.println("Phone Brand: " + this.alienPhone);

        // Arrays for phone details

        int modelIndex = -1, storageIndex = -1, colorIndex = -1;

        if (this.alienPhone.equals("Nokia")) {
            modelIndex = 6;
            storageIndex = 7;
            colorIndex = 8;
        }
        else if (this.alienPhone.equals("Samsung")) {
            modelIndex = 9;
            storageIndex = 10;
            colorIndex = 11;
        }
        else if (this.alienPhone.equals("Motorola")){
            modelIndex = 12;
            storageIndex = 13;
            colorIndex = 14;
        }

        // Check if a valid phone brand was entered
        if (modelIndex != -1) {
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
        } else {
            System.out.println("Invalid phone brand entered.");
        }

    }
}