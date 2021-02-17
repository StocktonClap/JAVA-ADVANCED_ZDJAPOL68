package homework.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dish implements Ingredient {

    private Ingredient[] ingredients;
    private double dishPrice;

    public Dish(Ingredient[] ingredients) {
        this.ingredients = ingredients;
        this.dishPrice = sumDishPrice();
    }

    @Override
    public double weight() {
        double sumWeight = 0;
        for (Ingredient i : ingredients) {
            sumWeight += i.weight();
        }
        return sumWeight;
    }

    @Override
    public double calories() {
        double sumCalories = 0;
        for (Ingredient i : ingredients) {
            sumCalories += i.calories();
        }
        return sumCalories;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "ingredients=" + ingredients +
                '}';
    }

    public double getDishPrice() {
        return dishPrice;
    }

    private double sumDishPrice(){
        for (Ingredient ingredient : ingredients) {
            if(ingredient instanceof Dish){
                dishPrice+=((Dish) ingredient).getDishPrice();
            }
            else if(ingredient instanceof ValuableIngredient){
                dishPrice+=((ValuableIngredient) ingredient).ingredientPrice();
            }
        }return dishPrice;
    }
}




