

public class PaymentSuccess implements PaymentState{

    public PaymentSuccess() {

    }

    @Override
    public void nextPaymentState(Payment payment) {
        System.out.println("Payment Successful! " + payment.getPaymentState());
    }

    @Override
    public void printPaymentStatus(Payment payment) {
        System.out.println("Payment State is Success!");
    }
}
