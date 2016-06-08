package tarasenko.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author tarasenko
 * @since 31.05.2016
 */
@Entity
@Table
public class Ingredient {
    @Id
    @Column
    private Long id;

    @XmlTransient
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productid")
    private Product product;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "amount='" + amount + '\'' +
                ", productName=" + product.getName() +
                '}';
    }
}
