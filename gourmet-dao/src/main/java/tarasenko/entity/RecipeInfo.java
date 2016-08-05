package tarasenko.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
//@Entity
public class RecipeInfo extends BaseEntity{
//    @Id
    private String id;

    private Long recipeId;

    private Long userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
