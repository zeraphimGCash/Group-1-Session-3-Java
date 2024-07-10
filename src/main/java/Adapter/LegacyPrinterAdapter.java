package Adapter;

import java.util.Currency;

class LegacyPrinterAdapter implements PaymentGateway {
    private final LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void processPayment(double amount, String currency) {
        // Adapt the payment processing logic
        legacyPrinter.initialize();
        legacyPrinter.printDocument();

        CurrencyConverter converter = new CurrencyConverter() {
            @Override
            double convertToPHP(double amount) {
                return 0;
            }
        };

        // Convert the amount to PHP based on currency type
        double convertedAmount;
        switch (currency) {
            case "USD":
                convertedAmount = amount * 58.33;
                break;
            case "EURO":
                convertedAmount = amount * 63.10;
                break;
            default:
                // Handle other currency types (if needed)
                convertedAmount = amount;
        }

        System.out.println("Payment processed for ₱" + convertedAmount);
    }
}