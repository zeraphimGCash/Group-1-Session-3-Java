package Adapter;

import java.util.Currency;

class LegacyPrinterAdapter implements PaymentGateway {
    private final LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void processPaymentPHP(double amount) {
        // Adapt the payment processing logic
        legacyPrinter.printDocument();

        // Convert the amount to PHP based on currency type
        double convertedAmount = amount;

        System.out.println("Payment processed for ₱" + convertedAmount + " from PHP " + amount);
        System.out.println("=".repeat(60));
    }

    @Override
    public void processPaymentUSD(double amount) {
        // Adapt the payment processing logic
        legacyPrinter.printDocument();

        // Convert the amount to PHP based on currency type
        double convertedAmount = amount * 58.33;

        System.out.println("Payment processed for ₱" + convertedAmount + " from USD " + amount);
        System.out.println("=".repeat(60));
    }

    @Override
    public void processPaymentEURO(double amount) {
        // Adapt the payment processing logic
        legacyPrinter.printDocument();

        // Convert the amount to PHP based on currency type
        double convertedAmount = amount * 63.10;

        System.out.println("Payment processed for ₱" + convertedAmount + " from EURO " + amount);
        System.out.println("=".repeat(60));
    }
}