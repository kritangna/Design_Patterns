package service;

import payment_gateway.PaymentGateway;

public class PaymentService {

    private static PaymentService paymentService;

    private PaymentService() {}

    public static PaymentService getPaymentService()
    {
        if(paymentService == null)
        {
            synchronized(PaymentService.class) {
                if(paymentService == null)
                    paymentService = new PaymentService();
            }
        }
        return paymentService;
    }
    public void processPayment(PaymentGateway gateway, double amount) {
        gateway.makePayment(amount);
    }
}
