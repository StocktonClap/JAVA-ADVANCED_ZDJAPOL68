package homework.task11;

public class StringPair implements Parable {
    private final String first;
    private final String second;

    public StringPair(String first, String second) {
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
