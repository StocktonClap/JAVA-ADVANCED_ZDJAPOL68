package homework.task7;

public class Tomato implements ValuableIngredient {
    private static final double CALORIES_PER_GRAM = 0.2;
    private static final double PRICE_PER_KG = 5.0;
    private final double weight;
    private final String name;
    private final String taste;
    private final String color;

    public Tomato(String name, double weight, String taste, String color) {
        this.weight = weight;
        this.name = name;
        this.taste = taste;
        this.color = color;
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
        return "Tomato{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double ingredientPrice() {
        return (weight / 1000) * PRICE_PER_KG;
    }
}
