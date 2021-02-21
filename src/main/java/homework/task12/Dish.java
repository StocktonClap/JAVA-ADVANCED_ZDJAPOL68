package homework.task12;

import java.util.*;

public class Dish implements Ingredient{
    private Map<String, Ingredient> ingredients;
    private String name;

    public Dish(String name) {
        this.name = name;
        this.ingredients = new HashMap<String, Ingredient>();
    }

    public Dish(Map<String, Ingredient> ingredients, String name) {
        this.ingredients = ingredients;
        this.name = name;
    }

    public void addIngredient (String string, Ingredient ingredient) {
        ingredients.put(string , ingredient);
    }

    public void removeIngredient (String string, Ingredient ingredient) {
        ingredients.remove(string);
    }


    public Map<String, Ingredient> ingredients () {
        Map<String, Ingredient> copyOfIngredients = new HashMap<>(ingredients);
        return copyOfIngredients;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double weight() {  // waga dania
        double sumWeight = 0;
        for (Map.Entry<String, Ingredient> ingredientEntry : ingredients.entrySet()) {
            sumWeight += ingredientEntry.getValue().weight();
        }
        return sumWeight;
    }

    @Override
    public double calories() {  // kalorie dania
        double sumCalories = 0;
        for (Map.Entry<String, Ingredient> ingredientEntry : ingredients.entrySet()) {
            sumCalories += ingredientEntry.getValue().calories();
        }
        return sumCalories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(ingredients, dish.ingredients) && Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients, name);
    }

}

