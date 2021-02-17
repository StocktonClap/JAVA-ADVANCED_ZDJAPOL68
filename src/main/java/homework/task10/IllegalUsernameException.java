package homework.task10;

public class IllegalUsernameException extends Exception{
    private static final String DEFAULT_MESSAGE = "Niepoprawne pole username!";
    private  final String username;

    public IllegalUsernameException(String username) {
        super(DEFAULT_MESSAGE);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
