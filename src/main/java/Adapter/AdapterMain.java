package Adapter;

// PaymentGateway serves as the target interface
// LegacyPrinter represents the existing system with a legacy printing method.
// LegacyPrinterAdapter adapts the LegacyPrinter to the PaymentGateway interface.

public class AdapterMain {
    public static void main(String[] args) {
        try {
            LegacyPrinter legacyPrinter = new LegacyPrinter();

            PaymentGateway paymentGateway = new LegacyPrinterAdapter(legacyPrinter);

            System.out.println();

            // Process payment using the adapted interface
            paymentGateway.processPaymentPHP(100.0);

            paymentGateway.processPaymentUSD(100.0);

            paymentGateway.processPaymentEURO(100.0);

            // Other Service Requests
            OtherRequests otherRequests = new OtherRequests();

            System.out.println("SERVICE WITHOUT INPUT");
            paymentGateway.processPaymentUSD(otherRequests.ServiceWithoutInput());

            System.out.println("SERVICE WITH INPUT");
            paymentGateway.processPaymentUSD(otherRequests.ServiceWithInput());

        }
        catch(Exception e){
            System.out.println("Error found:" + e);
        }
    }
}