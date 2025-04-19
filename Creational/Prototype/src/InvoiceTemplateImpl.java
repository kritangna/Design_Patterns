import java.util.ArrayList;
import java.util.List;

public class InvoiceTemplateImpl implements InvoiceTemplate {

    private String companyName;
    private Address address;
    private List<Item> items;

    public InvoiceTemplateImpl(String companyName, Address address) {
        this.companyName = companyName;
        this.address = address;
    }

    @Override
    public InvoiceTemplate clone(){
        try {
            items = new ArrayList<Item>();
            InvoiceTemplateImpl cloneTemplate = (InvoiceTemplateImpl) super.clone();
            cloneTemplate.address = address.clone();
            return cloneTemplate;
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
            System.out.println("Cloning failed");
            throw new RuntimeException("Cloning failed");
        }
    }

    @Override
    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public void printInvoice(String name) {
        System.out.println("Invoice for " + name);
        System.out.println("Company Name: " + companyName);
        System.out.println("Address: " + address);
        for(Item item : items) {
            System.out.println("Item: " + item);
        }
    }
}
