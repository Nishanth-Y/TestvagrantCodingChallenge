
public class ShoppingCart {
    public static void main(String[] args) {
        Product leather = new Product("Leather Jacket", 1100, 18, 1);
        Product umbrella = new Product("Umbrella", 900, 12, 4);
        Product cigarette = new Product("Cigarette", 200, 28, 3);
        Product honey = new Product("Honey", 100, 0, 2);
        Product[] productArray = {leather, umbrella, cigarette, honey};
        Product maxGstProduct = MaxProductGST(productArray);
        int totalAmount = calculateTotalAmount(productArray);
        System.out.println("--------------------------------");
        System.out.println("Checkout               Rs. " + totalAmount);
        System.out.println("Max Product: " + maxGstProduct.getProductName());

    }

    private static Product MaxProductGST(Product[] products) {
        Product maxGstProduct = null;
        double maxGstAmount = 0;
        for (Product product: products) {
            double gstAmount = (double) (product.getUnitPrice() * product.getGST()) / 100;
            if (gstAmount > maxGstAmount) {
                maxGstAmount = gstAmount;
                maxGstProduct = product;
            }
        }
        return maxGstProduct;
    }

    private static int calculateTotalAmount(Product[] products) {
        int totalAmount = 0;
        for (Product product: products) {
           double gstAmount = (double) (product.getGST() * product.getUnitPrice()) / 100;
           double discount = product.getUnitPrice();
           if (product.getUnitPrice() >= 500){
               discount = product.getUnitPrice() - (0.05 * product.getUnitPrice());
           }
           totalAmount += (int) ((discount + gstAmount)*product.getQuantity());
           System.out.println("Product: " + product.getProductName() + " Amount: " + (discount + gstAmount)*product.getQuantity());
        }
        return totalAmount;

    }
}

