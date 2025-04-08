import config.RazorpayClient;
import service.PaymentService;
import service.impl.PaymentServiceImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String key = "ABCD1234";
        String secret = "!@#$";
        RazorpayClient.setKeySecret(key, secret);

        PaymentService service = new PaymentServiceImpl();
        service.makePayment(BigDecimal.valueOf(117924.47));
    }
}