package homework.task12;

import java.util.*;

public class Pizza extends Dish implements Ingredient {
    private Map<String, Ingredient> ingredients;

    public Pizza(String name) {
        super(name);
        this.ingredients = new HashMap<>();
    }

    public boolean addCake(Cake cake) {
        if (ingredients.containsKey("Cake"))
            return false;
        ingredients.put("Cake", cake);
        return true;
    }


    public boolean addHam(Ham ham) {
        if (ingredients.containsKey("Ham"))
            return false;
        ingredients.put("Ham", ham);
        return true;
    }


    public boolean addTomato (Tomato tomato) {
        if (ingredients.containsKey("Tomato"))
            return false;
        ingredients.put("Tomato", tomato);
        return true;
    }

    public boolean addEgg (Egg egg) {
        if (ingredients.containsKey("Egg"))
            return false;
        ingredients.put("Egg", egg);
        return true;
    }

    public boolean addCheese (Cheese cheese) {
        if (ingredients.containsKey("Cheese"))
            return false;
        ingredients.put("Cheese", cheese);
        return true;
    }

    public boolean addTomatoSauce(TomatoSauce tomatoSauce) {
        if (ingredients.containsKey("Tomato Sauce"))
            return false;
        ingredients.put("Tomato Sauce", tomatoSauce);
        return true;
    }

    //dodaj metody dodające pozostałe składniki

    public boolean isReady() {
        if (ingredients.containsKey("Cake") &&
                ingredients.containsKey("Tomato Sauce") &&
                ingredients.containsKey("Ham") &&
                ingredients.containsKey("Egg") &&
                ingredients.containsKey("Tomato") &&
                ingredients.containsKey("Cheese"))
            return true;
        return false;
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
    public String toString() {
        return "Pizza{" +
                "ingredients=" + ingredients +
                '}';
    }
}
