package homework.task12;

public class Tomato implements Ingredient{
    private static final double CALORIES_PER_GRAM = 0.5;
    final String name;
    final double weight;

    public Tomato(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String name() {
        return name;
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
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
