package tovar;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int productId, String name, String manufacturer) {
        super(productId, name);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
