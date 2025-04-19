public interface InvoiceTemplate extends Cloneable {

    InvoiceTemplate clone();
    void addItem(Item item);
    void printInvoice(String name);
}
