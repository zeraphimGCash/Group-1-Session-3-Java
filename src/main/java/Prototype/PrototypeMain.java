package Prototype;

import java.util.Scanner;

class PrototypeMain {
    public static void main(String[] args) {


        try {
            SuperAlienPhone S1 = new SuperAlienPhone();
            String userInput1 = whichOption();
            if (userInput1.equalsIgnoreCase("yes")) {
                S1.getDetailsCoolPhone();
            } else if (userInput1.equalsIgnoreCase("no")) {
                S1.getDetailsKeypadPhone();
            }
            System.out.println();

            int Exiter = 0;
            while (Exiter == 0) {
                SuperAlienPhone S2 = (SuperAlienPhone) S1.getClone();
                if (userInput1.equalsIgnoreCase("yes")) {
                    S2.getDetailsCoolPhone();
                }
                else if (userInput1.equalsIgnoreCase("no")){
                    S2.getDetailsKeypadPhone();
                }

                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("whatsup");
        }
    }
    public static String whichOption(){

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Do you want to buy a cool phone? (yes/no)? ");
        System.out.println("If not, you will be redirected to buy keypad phones instead: ");
        String userInput1 = scanner.nextLine().trim();
        return userInput1;

    }
}