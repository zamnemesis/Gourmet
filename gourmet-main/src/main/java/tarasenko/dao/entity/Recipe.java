package tarasenko.dao.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
@Entity
@Table
public class Recipe {
    @Id
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String instruction;

    @XmlTransient
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cuisineid")
    private List<Ingredient> ingredients;

    @XmlTransient
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cuisineid")
    private String cuisine;

    @XmlTransient
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryid")
    private String category;

    @XmlTransient
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "preferenceid")
    private String preference;

    @Column
    private String portion;

    @Column(name = "time")
    private Integer cookingTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPortion() {
        return portion;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }

    public Integer getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(Integer cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }
}
