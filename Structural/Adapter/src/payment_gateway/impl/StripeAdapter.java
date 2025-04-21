package payment_gateway.impl;

import integration.stripe.StripeSDK;
import payment_gateway.PaymentGateway;

public class StripeAdapter implements PaymentGateway {

    private StripeSDK stripeSDK;

    public StripeAdapter() {
        this.stripeSDK = new StripeSDK();
    }

    @Override
    public void makePayment(double amount) {
        stripeSDK.makeStripeSDKPayment(amount);
    }
}
