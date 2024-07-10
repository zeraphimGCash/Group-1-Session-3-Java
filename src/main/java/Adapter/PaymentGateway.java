package Adapter;

public interface PaymentGateway {
    void processPaymentPHP(double amount);
    void processPaymentUSD(double amount);
    void processPaymentEURO(double amount);
}
