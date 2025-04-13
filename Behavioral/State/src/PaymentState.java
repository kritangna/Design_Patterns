public interface PaymentState {

    void nextPaymentState(Payment payment);

    void printPaymentStatus(Payment payment);
}
