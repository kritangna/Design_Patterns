

public class PaymentPending implements PaymentState {

    public PaymentPending() {

    }

    @Override
    public void nextPaymentState(Payment payment) {
        try {
            long startTime = System.currentTimeMillis();
            long duration = 3000;
            long sleepTime = 300;
            if(sleepTime < duration) {
                while (System.currentTimeMillis() - startTime < duration) {
                    System.out.println("Payment is in progress...");
                    Thread.sleep(sleepTime);
                }
                payment.setPaymentState(new PaymentSuccess());
            }
            else {
                payment.setPaymentState(new PaymentFailure());
            }
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Interrupted while waiting for payment state");
        }
    }

    @Override
    public void printPaymentStatus(Payment payment) {
        System.out.println("Payment is in Pending State!");
    }
}
