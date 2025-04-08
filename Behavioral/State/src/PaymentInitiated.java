
public class PaymentInitiated implements PaymentState {

    public PaymentInitiated() {

    }

    @Override
    public void nextPaymentState(Payment payment) {
        payment.setPaymentState(new PaymentPending());
    }

    @Override
    public void printPaymentStatus(Payment payment) {
        System.out.println("Payment has been initiated!");
    }
}
