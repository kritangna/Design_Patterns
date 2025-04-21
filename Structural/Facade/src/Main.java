import service.OrderFacade;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********** Placing a new Order **********");
        OrderFacade order1 = new OrderFacade();
        order1.placeOrder("Badminton", 1299.00, "Wellington street", "Alice");

        System.out.println("*********** Placing a new Order **********");
        OrderFacade order2 = new OrderFacade();
        order2.placeOrder("Cycle", 25000.00, "Richmond Town", "Bob");

        System.out.println("*********** Placing a new Order **********");
        OrderFacade order3 = new OrderFacade();
        order3.placeOrder(null, 799.00, "JP Nagar", "Marcy");

    }
}