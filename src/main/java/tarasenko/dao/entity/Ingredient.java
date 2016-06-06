package tarasenko.dao.entity;

/**
 * @author tarasenko
 * @since 31.05.2016
 */
public class Ingredient {
    private Long id;
    private Product product;
    private String amount;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
