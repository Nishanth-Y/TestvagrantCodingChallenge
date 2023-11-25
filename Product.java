public class Product{
    private String productName;
    private int unitPrice;
    private int GST;
    private int Quantity;

    public Product(String productName, int unitPrice, int GST, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.GST = GST;
        Quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getGST() {
        return GST;
    }

    public void setGST(int GST) {
        this.GST = GST;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}