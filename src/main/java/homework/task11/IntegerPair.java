package homework.task11;

public class IntegerPair implements Parable {
    private final int first;
    private final int second;

    public IntegerPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Integer getFirst() {
        return first;
    }

    @Override
    public Integer getSecond() {
        return second;
    }
}