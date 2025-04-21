package service;

public class OrderFacade {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private NotificationService notificationService;
    public OrderFacade() {
        inventoryService = new InventoryService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        notificationService = new NotificationService();
    }

    public void placeOrder(String item, Double amount, String area, String user)
    {
        if(inventoryService.checkStock(item) != null)
        {
            paymentService.makePayment(amount);
            shippingService.shipOrder(area);
            notificationService.sendSMS(user, "Order Placed successfully!");
            System.out.println("Hey " + user + " Your Order has been Placed successfully with item: " + item);
        }
        else
        {
            notificationService.sendSMS(user, "Order Not Placed!");
            System.out.println("Hey " + user + " Your Order could not be placed with item: " + item);
        }
    }
}
