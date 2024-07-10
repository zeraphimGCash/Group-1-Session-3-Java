package Adapter;

class LegacyPrinterAdapter implements PaymentGateway {
    private final LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void processPayment(double amount) {
        // Adapt the payment processing logic
        legacyPrinter.initialize();
        legacyPrinter.printDocument();
        System.out.println("Payment processed for ₱" + amount);
    }
}