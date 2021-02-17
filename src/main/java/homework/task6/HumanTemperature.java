package homework.task6;

public class HumanTemperature {
    double humanTemperature;

    private HumanTemperature(double humanTemperature) {
        this.humanTemperature = humanTemperature;
    }

    public static HumanTemperature of (double temperature) {
        if (temperature > 20 && temperature < 43)
        return new HumanTemperature(temperature);
        return null;
    }

    public double getHumanTemperature() {
        return humanTemperature;
    }

    public double getKelvin () {
        return humanTemperature + 273;
    }

    public double getFahrenheit () {
        return ((9 * humanTemperature) / 5 ) + 32;
    }

    public boolean isNormal () {
        return (humanTemperature >= 36 && humanTemperature <=37);
    }

    public String format() {
        return String.format( "%.2f", humanTemperature) + " °C";
    }
}
