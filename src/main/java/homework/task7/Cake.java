package homework.task7;

public class Cake implements ValuableIngredient {
    private static final double CALORIES_PER_GRAM = 3.20;
    private static final double PRICE_PER_KG = 20.0;
    private final double weight;
    private final String name;
    private final String taste;


    public Cake(String name, double weight, String taste) {
        this.weight = weight;
        this.name = name;
        this.taste = taste;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return weight * CALORIES_PER_GRAM;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }

    @Override
    public double ingredientPrice() {
        return (weight / 1000) * PRICE_PER_KG;
    }
}
