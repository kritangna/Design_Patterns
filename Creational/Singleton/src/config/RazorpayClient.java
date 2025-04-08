package config;

import java.math.BigDecimal;

public class RazorpayClient {

    private static String apiKey;
    private static String apiSecret;
    private static RazorpayClient client;

    private RazorpayClient() {
        System.out.println("Creating Razorpay Client with API Key: " + apiKey + " and API Secret: " + apiSecret);
    }

    public static RazorpayClient getInstance() {
        if(client == null) {
            synchronized (RazorpayClient.class) {
                if(client == null) {
                    client  = new RazorpayClient();
                }
            }
        }
        return client;
    }

    public static void setKeySecret(String apiKey, String apiSecret) {
        RazorpayClient.apiKey = apiKey;
        RazorpayClient.apiSecret = apiSecret;
    }

    public void initiatePayment(BigDecimal amount) {
        System.out.println("Initiating Razorpay Payment with amount: " + amount);
    }
}
