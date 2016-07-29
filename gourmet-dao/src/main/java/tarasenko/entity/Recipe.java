package tarasenko.entity;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
@Entity
@Table
public class Recipe extends BaseEntity{
    @Id
    @Column(name = "recipe_id")
    private String id;

    @Column
    private String name;

    @Column
    private String instruction;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "recipe_id")
    @Fetch(value = org.hibernate.annotations.FetchMode.SELECT)
    private List<Ingredient> ingredients;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cuisine_id")
    private Cuisine cuisine;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", instruction='" + instruction + '\'' +
                ", ingredients=" + ingredients.toString() +
                ", cuisine=" + cuisine.getName() +
                ", category=" + category.getName() +
                ", preference=" + preference.getName() +
                ", portion='" + portion + '\'' +
                ", cookingTime=" + cookingTime +
                '}';
    }
}
