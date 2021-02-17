package homework.task11;

public class Pair<T, U> implements Parable <T, U>  {
    final T first;
    final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public T getFirst() {
        return first;
    }

    @Override
    public U getSecond() {
        return second;
    }
}
