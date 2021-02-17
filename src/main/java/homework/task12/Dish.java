package homework.task12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Dish implements Ingredient{
    final Collection<Ingredient> ingredients;
    final String name;

    public Dish(String name, Collection<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public void addIngredient (Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient (Ingredient ingredient) {
        this.ingredients.remove(ingredient);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double weight() {  // waga dania
        double sumWeight = 0;
        for (Ingredient i : ingredients) {
            sumWeight += i.weight();
        }
        return sumWeight;
    }

    @Override
    public double calories() {  // kalorie dania
        double sumCalories = 0;
        for (Ingredient i : ingredients) {
            sumCalories += i.calories();
        }
        return sumCalories;
    }

    public void ingredients () {
        List<Ingredient> copyIngredients = new ArrayList<Ingredient>(ingredients);
        System.out.println(copyIngredients);
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

