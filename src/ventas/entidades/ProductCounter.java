package ventas.entidades;

public class ProductCounter {

    public Product product;
    public int quantity;

    public ProductCounter(Product product, int quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    public void sellProduct() {

        product.decrementQuantity(quantity);
    }
}
