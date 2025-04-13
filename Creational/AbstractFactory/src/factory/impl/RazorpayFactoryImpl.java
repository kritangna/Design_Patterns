package factory.impl;

import service.PaymentService;
import service.RefundService;
import factory.PaymentGatewayFactory;
import service.impl.RazorpayPaymentServiceImpl;
import service.impl.RazorpayRefundServiceImpl;

public class RazorpayFactoryImpl implements PaymentGatewayFactory {
    @Override
    public PaymentService createPaymentService() {
        return new RazorpayPaymentServiceImpl();
    }

    @Override
    public RefundService createRefundService() {
        return new RazorpayRefundServiceImpl();
    }
}
