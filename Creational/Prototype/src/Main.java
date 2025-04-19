public class Main {
    public static void main(String[] args) {

        Address address = new Address("Bengaluru", "Karnataka", "560078");
        InvoiceTemplate template = new InvoiceTemplateImpl("Amazon", address);

        InvoiceTemplate invoice1 = template.clone();
        Item item1 = new Item("Hp Laptop", 57000);
        Item item2 = new Item("Macbook", 137000);
        invoice1.addItem(item1);
        invoice1.addItem(item2);
        invoice1.printInvoice("Alice");

        System.out.println("***************************************************");

        InvoiceTemplate invoice2 = template.clone();
        Item item3 = new Item("Mocobara bag", 7000);
        Item item4 = new Item("Chanel bag", 80000);
        invoice2.addItem(item3);
        invoice2.addItem(item4);
        invoice2.printInvoice("Margaret");

        System.out.println("***************************************************");

        InvoiceTemplate invoice3 = template.clone();
        Item item5 = new Item("Minimalist AHA Serum", 699);
        Item item6 = new Item("Ordinary Retinol", 799);
        invoice3.addItem(item5);
        invoice3.addItem(item6);
        invoice3.printInvoice("Cersi");
    }
}