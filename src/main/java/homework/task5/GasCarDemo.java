package homework.task5;

public class GasCarDemo {
    public static void main(String[] args) {

        GasCar gasCar = new GasCar(30);
        System.out.println(gasCar);
        System.out.println(gasCar.refuel(70));
        System.out.println(gasCar);
        System.out.println(gasCar.consume(110));
        System.out.println(gasCar);
    }
}
