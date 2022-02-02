public class Bagels {
    protected String SKU = "";
    protected float price;
    // Use a map to assign prices
    public Bagels(String SKU) {
        this.SKU = SKU;
        this.price = 1f;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
