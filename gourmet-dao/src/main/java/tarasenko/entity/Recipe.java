package tarasenko.entity;

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
    @Column (name = "recipe_id")
    private String id;

    @Column
    private String name;

    @Column
    private String instruction;

    @OneToMany
    @JoinColumn(name = "ingredient_id")
    private List<Ingredient> ingredients;

    @ManyToOne
    @JoinColumn(name = "cuisine_id")
    private Cuisine cuisine;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "preference_id")
    private Preference preference;

    @Column
    private String portion;

    @Column(name = "time")
    private Integer cookingTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
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

    @Override
    public String toString() {
        return "Recipe{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", instruction='" + instruction + '\'' +
                ", ingredients=" + ingredients +
                ", cuisine=" + cuisine +
                ", category=" + category +
                ", preference=" + preference +
                ", portion='" + portion + '\'' +
                ", cookingTime=" + cookingTime +
                '}';
    }
}
