package homework.task12;

public class Cheese implements Ingredient{
    private static double CALORIES_PER_GRAM = 4.02;
    final String name;
    final double weight;

    public Cheese(String name, double weight) {
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
        return "Cheese{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
