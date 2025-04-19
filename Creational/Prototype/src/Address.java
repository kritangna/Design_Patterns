public class Address implements Cloneable {

    private String city;
    private String state;
    private String zipcode;

    public Address(String city, String state, String zipcode) {
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return city + " " + state + " " + zipcode;
    }

    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
