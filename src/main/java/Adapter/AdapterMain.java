package Adapter;

// PaymentGateway serves as the target interface
// LegacyPrinter represents the existing system with a legacy printing method.
// LegacyPrinterAdapter adapts the LegacyPrinter to the PaymentGateway interface.

public class AdapterMain {
    public static void main(String[] args) {
        try {
            LegacyPrinter legacyPrinter = new LegacyPrinter();

            PaymentGateway paymentGateway = new LegacyPrinterAdapter(legacyPrinter);

            // Process payment using the adapted interface
            paymentGateway.processPayment(100.0, "USD");

        }
        catch(Exception e){
            System.out.println("Error found:" + e);
        }
    }
}