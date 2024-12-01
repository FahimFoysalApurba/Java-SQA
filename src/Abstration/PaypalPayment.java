package Abstration;

public class PaypalPayment implements Payment{
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
