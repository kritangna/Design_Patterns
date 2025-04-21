package service;

public class InventoryService {

    public InventoryService() {
    }

    public String checkStock(String item) {
        System.out.println("Checking stock for product " + item);
        return item;
    }
}
