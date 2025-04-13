package factory;

import service.PaymentService;
import service.RefundService;

public interface PaymentGatewayFactory {
    PaymentService createPaymentService();
    RefundService createRefundService();
}
