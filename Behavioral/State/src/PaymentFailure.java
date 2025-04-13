
public class PaymentFailure implements PaymentState {

    public PaymentFailure() {

    }

    @Override
    public void nextPaymentState(Payment payment) {
        payment.setPaymentState(new PaymentInitiated());
    }

    @Override
    public void printPaymentStatus(Payment payment) {
        System.out.println("Payment State is Failed!");
    }
}
