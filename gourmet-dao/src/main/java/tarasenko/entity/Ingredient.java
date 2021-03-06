package tarasenko.entity;

import javax.persistence.*;

/**
 * @author tarasenko
 * @since 31.05.2016
 */
@Entity
@Table
public class Ingredient extends BaseEntity{
    @Id
    @Column(name = "ingredient_id")
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne()
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @Column
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id='" + id + '\'' +
                ", product=\"" + product.getName() + "\"" +
                ", recipe=\"" + recipe.getName() + "\"" +
                ", amount='" + amount + '\'' +
                '}';
    }
}
