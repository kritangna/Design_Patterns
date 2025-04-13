package util;

import factory.PaymentGatewayFactory;
import service.PaymentService;
import service.RefundService;

public class PaymentProcessor {

    private PaymentService paymentService;
    private RefundService refundService;

    public PaymentProcessor(PaymentGatewayFactory paymentGatewayFactory) {
        this.paymentService = paymentGatewayFactory.createPaymentService();
        this.refundService = paymentGatewayFactory.createRefundService();
    }

    public void processPayment(Double amount) {
        paymentService.makePayment(amount);
        refundService.makeRefund(amount/2);
    }
}
