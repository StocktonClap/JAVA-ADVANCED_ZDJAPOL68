package homework.task10;

public class IllegalTopDomainException extends Exception{
    private static final String DEFAULT_MESSAGE = "Niepoprawna pole topDomain!";
    private final String topDomain;

    public IllegalTopDomainException(String topDomain) {
        super(DEFAULT_MESSAGE);
        this.topDomain = topDomain;
    }

    public String getTopDomain() {
        return topDomain;
    }
}
