package Adapter;

import java.util.Scanner;

public class OtherRequests {
    public double ServiceWithInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = scanner.nextDouble();

        return amount;
    }

    public double ServiceWithoutInput() {
        return 300;
    }


}
