package homework.task12;

import java.util.Collection;

public class Pizza extends Dish implements Ingredient{

    public Pizza(String name, Collection<Ingredient> ingredients) {
        super(name, ingredients);
    }

    public boolean addCake (Cake cake) {
        if (ingredients.contains(cake)) {
            System.out.println("Nie można dodać produktu. Pizza zawiera już ciasto !!!");
            return false;
        } else if (!ingredients.contains(cake)) {
            ingredients.add(cake);
            System.out.println("Dodawanie produktu");
        }
        return true;
    }

    public boolean addHam (Ham ham) {
        if (ingredients.contains(ham)) {
        System.out.println("Nie można dodać produktu. Pizza zawiera już ciasto !!!");
        return false;
    } else if (!ingredients.contains(ham)) {
        ingredients.add(ham);
        System.out.println("Dodawanie produktu");
    }
        return true;
    }

    public boolean addTomato (Tomato tomato) {
        if (ingredients.contains(tomato)) {
            System.out.println("Nie można dodać produktu. Pizza zawiera już ciasto !!!");
            return false;
        } else if (!ingredients.contains(tomato)) {
            ingredients.add(tomato);
            System.out.println("Dodawanie produktu");
        }
        return true;
    }

    public boolean addEgg (Egg egg) {
        if (ingredients.contains(egg)) {
            System.out.println("Nie można dodać produktu. Pizza zawiera już ciasto !!!");
            return false;
        } else if (!ingredients.contains(egg)) {
            ingredients.add(egg);
            System.out.println("Dodawanie produktu");
        }
        return true;
    }

    public boolean addCheese (Cheese cheese) {
        if (ingredients.contains(cheese)) {
            System.out.println("Nie można dodać produktu. Pizza zawiera już ciasto !!!");
            return false;
        } else if (!ingredients.contains(cheese)) {
            ingredients.add(cheese);
            System.out.println("Dodawanie produktu");
        }
        return true;
    }

    public boolean addTomatoSauce(TomatoSauce tomatoSauce) {
        if (ingredients.contains(tomatoSauce)) {
            System.out.println("Nie można dodać produktu. Pizza zawiera już ciasto !!!");
            return false;
        } else if (!ingredients.contains(tomatoSauce)) {
            ingredients.add(tomatoSauce);
            System.out.println("Dodawanie produktu");
        }
        return true;
    }

    //dodaj metody dodające pozostałe składniki

    public boolean isReady() {
        //zwróć true jeśli są wszystkie składniki
        return false;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                ", name='" + name + '\'' +
                "ingredients=" + ingredients +
                '}';
    }
}
