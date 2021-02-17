package homework.task10;

public class IllegalHostException extends Exception{
    private static final String DEFAULT_MESSAGE = "Niepoprawne pole host!";
    private final String host;

    public IllegalHostException(String host) {
        super(DEFAULT_MESSAGE);
        this.host = host;
    }

    public String getHost() {
        return host;
    }
}
