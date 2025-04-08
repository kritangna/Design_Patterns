package service;

import java.math.BigDecimal;

public interface PaymentService {

    void makePayment(BigDecimal amount);
}
