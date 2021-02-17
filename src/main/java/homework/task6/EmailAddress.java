package homework.task6;

import java.util.regex.Pattern;

public class EmailAddress {
    private static final String pattern ="[0-9a-zA-Z][\\dA-z-_.]+@([A-z\\d][A-z\\d-]+\\.){1,6}([A-z]{2,6})$";
    private String emailAddress;

    private EmailAddress(String email) {
        this.emailAddress = email;
    }

    public static EmailAddress of(String email) {
        if (Pattern.matches(pattern, email)) return new EmailAddress(email);
        return null;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUserName() {
        return emailAddress.substring(0, emailAddress.indexOf("@"));
    }

    public String getHost() {
        return emailAddress.substring(emailAddress.indexOf("@") + 1);
    }

    public String topDomain() {
        return emailAddress.substring(emailAddress.lastIndexOf('.')+1);
    }
}
