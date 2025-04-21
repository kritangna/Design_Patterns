import payment_gateway.PaymentGateway;
import payment_gateway.impl.RazorpayGateway;
import payment_gateway.impl.StripeAdapter;
import service.PaymentService;

public class Main {
    public static void main(String[] args) {

        // PaymentService class is Singleton as it is not holding any user sessions
        PaymentService paymentService = PaymentService.getPaymentService();

        PaymentGateway razorpay = new RazorpayGateway();

        // Using a StripeAdapter class to process Stripe Payments
        PaymentGateway stripe = new StripeAdapter();

        paymentService.processPayment(razorpay, 3500000);
        paymentService.processPayment(stripe, 4500000);
        paymentService.processPayment(razorpay, 5500000);
        paymentService.processPayment(stripe, 6500000);
    }
}