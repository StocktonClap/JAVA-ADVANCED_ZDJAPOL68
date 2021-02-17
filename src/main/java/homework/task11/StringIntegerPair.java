package homework.task11;

public class StringIntegerPair implements Parable {
    private final String first;
    private final int second;

    public StringIntegerPair(String first, int second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public Object getFirst() {
        return first;
    }

    @Override
    public Object getSecond() {
        return second;
    }
}
