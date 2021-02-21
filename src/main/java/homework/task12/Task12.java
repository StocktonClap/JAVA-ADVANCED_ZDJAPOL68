package homework.task12;

import java.util.ArrayList;
import java.util.List;

/**
 * Część 1
 * Rozbuduj klasę Dish o metody:
 * konstruktor, w którym oprócz nazwy należy podać dowolny rodzaj kolekcji ze składnikami
 * metody:
 *  addIngredient(Ingredient ingredient) - dodająca dowolny składnik do listy składników
 *  weight() - obliczająca masę całego dania
 *  calories() - obliczająca liczbę kalorii całego dania
 *  hashCode i equals, tak aby dwa obiekty Dish były równe jeśli skłądają się z takich samych składników
 *  ingredients() - zwraca listę wszystkich składników, która jest kopią pola ingredients
 *
 * Część 2
 * Rozbuduj klasę Pizza, która jest daniem o ustalonej liście składników: Cake, Tomato, Cheese (zdefiniuj brakującą klasę), dodając:
 *   - kolejne metody dodające konkretne składniki: Tomato, Cheese, która zwracają true gdy dodano składnik
 *   - każda z metod dodaje składnik tylko raz, jeśli już jest dany składnik to nie dodaje go i zwraca false
 *   - zaimplementuj metodę isReady(), która zwróci tru,  gdy w kolekcji ingredients znajdują się wszystkie wymagane składniki:
 *   Cake, Tomato, Cheese
 *
 * Częśc 3
 * Napisz klasy testowe dla klas Dish i Pizza, w której należy uwzględnić następujące przypadki:
 * - tworzenie dania z pusta lista składników
 * - tworzenie dania z kilkoma rodzajami kolekcji składników np. List, Set, Collection
 * - tworzenie dwóch dań o identycznych składnikach
 * - tworzenie dania z dowolnych składników
 * Testy powinny potwierdzić poprawność działania metod weigth, calories, equals w każdym podanym scenariuszu.
 */
public class Task12 {
    public static void main(String[] args) {

        Cake cake = new Cake("cienkie ciasto", 200);
        TomatoSauce tomatoSauce = new TomatoSauce("pomidorro", 80);
        Ham ham = new Ham("prosciutto cotto", 110);
        Egg egg = new Egg("wiejskie", 90);
        Tomato tomato = new Tomato("San Marzano", 180);
        Cheese cheese = new Cheese("mozzarella", 125);


        Pizza pizza = new Pizza("Pepperoni");
        pizza.addCheese(new Cheese("mozzarella", 125));
        pizza.addCake(new Cake("cienkie ciasto", 200));
        System.out.println(pizza);

        Pizza pizza1 = new Pizza("Mamma Mia");
        pizza1.addCake(cake);
        pizza1.addCheese(cheese);
        pizza1.addTomatoSauce(tomatoSauce);
        pizza1.addTomato(tomato);
        pizza1.addHam(ham);
        pizza1.addEgg(egg);
        System.out.println(pizza1);

        System.out.println("Kalorie:");
        System.out.format("%.2f", pizza1.calories());
        System.out.println();
        System.out.println("Waga: ");
        System.out.format("%.2f", pizza1.weight());
        System.out.println();
        System.out.println(pizza.isReady());
        System.out.println(pizza1.isReady());
    }
}
