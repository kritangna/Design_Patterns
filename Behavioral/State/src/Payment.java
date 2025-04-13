public class Payment {

    private PaymentState paymentState;

    public Payment() {
        this.paymentState = new PaymentInitiated();
    }

    public PaymentState getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setNextPaymentState() {
        paymentState.nextPaymentState(this);
    }
    public void printPaymentStatus() {
        this.paymentState.printPaymentStatus(this);
    }
}


