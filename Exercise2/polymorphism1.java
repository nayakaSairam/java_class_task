abstract class Payment {
    public abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UpiPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CashPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();
        Payment p3 = new CashPayment();

        p1.pay(500);
        p2.pay(250);
        p3.pay(100);

        Payment[] payments = { new CreditCardPayment(), new UpiPayment(), new CashPayment() };
        for (Payment p : payments) {
            p.pay(999);
        }
    }
}
