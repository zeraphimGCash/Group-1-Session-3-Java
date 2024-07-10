package Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        PaymentGateway paymentGateway = new LegacyPrinterAdapter(legacyPrinter);

        // Process payment using the adapted interface
        paymentGateway.processPayment(100.0);
    }
}