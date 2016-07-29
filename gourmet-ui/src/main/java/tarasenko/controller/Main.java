package tarasenko.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tarasenko.*;
import tarasenko.entity.*;

import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
public class Main {


    public static void main(String[] args) {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("spring-config.xml");

        UserService userService = (UserService) appContext.getBean("userService");
        CategoryService categoryService = (CategoryService) appContext.getBean("categoryService");
        PreferenceService preferenceService = (PreferenceService) appContext.getBean("preferenceService");
        ProductService productService = (ProductService) appContext.getBean("productService");
        RecipeService recipeService = (RecipeService) appContext.getBean("recipeService");
        IngredientService ingredientService = (IngredientService) appContext.getBean("ingredientService");

        System.out.println(userService.getUser("22ee0649-fbce-47a0-9f03-12af4e234543"));

        User newUser = new User();
        newUser.setLogin("operator");
        newUser.setPassword("operator");
        userService.saveUser(newUser);

        System.out.println(newUser);
        System.out.println();

        List<Category> categoryList = categoryService.getCategories();
        for (Category category : categoryList) {
            System.out.println(category);
        }
        System.out.println();

        List<Preference> preferenceList = preferenceService.getPreferences();
        for (Preference preference : preferenceList) {
            System.out.println(preference);
        }
        System.out.println();

        List<Product> productList = productService.getProducts();
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println();

        List<Recipe> recipeList = recipeService.getRecipes();
        for (Recipe recipe : recipeList) {
            System.out.println(recipe);
        }

        System.out.println();

        List<Ingredient> ingredientList = ingredientService.getIngredients();
        for (Ingredient ingredient : ingredientList) {
            System.out.println(ingredient);
        }
    }
}
