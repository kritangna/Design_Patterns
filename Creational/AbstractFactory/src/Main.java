import factory.PaymentGatewayFactory;
import factory.impl.RazorpayFactoryImpl;
import factory.impl.StripeFactoryImpl;
import util.PaymentProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PaymentGatewayFactory factory;
        int num=0;
        String paymentType = "";
        while(true)
        {
            System.out.println("Choose your payment method");
            System.out.println("1. Razorpay    2. Stripe");
            Scanner scanner = new Scanner(System.in);
            paymentType = scanner.nextLine();
            switch (paymentType) {
                case "Razorpay":
                    factory = new RazorpayFactoryImpl();
                    break;
                case "Stripe":
                    factory = new StripeFactoryImpl();
                    break;
                default:
                    System.out.println("Invalid payment type");
                    continue;
            }
            break;
        }
        PaymentProcessor paymentProcessor = new PaymentProcessor(factory);
        paymentProcessor.processPayment(3400000.00);
    }
}