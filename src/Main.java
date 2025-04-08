

public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.printPaymentStatus();

        payment.setNextPaymentState();
        payment.printPaymentStatus();

        payment.setNextPaymentState();
        payment.printPaymentStatus();
    }
}