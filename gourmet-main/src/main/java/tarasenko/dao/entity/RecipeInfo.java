package tarasenko.dao.entity;

import javax.persistence.Entity;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
@Entity
public class RecipeInfo {
    private Long id;
    private Long recipeId;
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
