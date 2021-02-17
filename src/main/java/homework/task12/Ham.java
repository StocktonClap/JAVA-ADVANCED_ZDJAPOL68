package homework.task12;

public class Ham implements Ingredient{
    final static double CALORIES_PER_GRAM = 1.45;
    final String name;
    final double weight;

    public Ham(String name, double weight) {
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
        return "Ham{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
