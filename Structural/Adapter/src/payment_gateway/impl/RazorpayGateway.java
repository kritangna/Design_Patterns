package payment_gateway.impl;

import payment_gateway.PaymentGateway;

public class RazorpayGateway implements PaymentGateway {

    public RazorpayGateway() {}

    @Override
    public void makePayment(double amount) {
        System.out.println("Making Razorpay Payment of amount: " + amount);
    }
}
