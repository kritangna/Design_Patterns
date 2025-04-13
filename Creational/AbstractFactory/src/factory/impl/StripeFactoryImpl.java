package factory.impl;

import factory.PaymentGatewayFactory;
import service.PaymentService;
import service.RefundService;
import service.impl.RazorpayRefundServiceImpl;
import service.impl.StripePaymentServiceImpl;

public class StripeFactoryImpl implements PaymentGatewayFactory {
    @Override
    public PaymentService createPaymentService() {
        return new StripePaymentServiceImpl();
    }

    @Override
    public RefundService createRefundService() {
        return new RazorpayRefundServiceImpl();
    }
}
