package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email extends Message{
    final String  emailAddress;
    final String subject;

    public Email(String content) {
        super(content);
        emailAddress = "";
        subject = "";
    }

    public Email(String content, String emailAddress, String subject) {
        super(content);
        this.emailAddress = emailAddress;
        this.subject = subject;
    }

    @Override
    public String send() {
        if (canSend())
        return "Mail o treści: " + getContent() + " został wysłany na adres " + emailAddress;
            return "Mail nie może zostać wysłany.";
    }

    @Override
    public boolean canSend() {
        if (emailAddress == null || subject == null) return false;
        return super.canSend() && Pattern.matches("[0-9a-zA-Z][\\dA-z-_.]+@([A-z\\d][A-z\\d-]+\\.){1,6}[A-z]{2,6}",emailAddress)
                &&  Pattern.matches(".*",subject);
    }

    public boolean isEmail () {
        if (emailAddress == null) return false;
      return this.emailAddress.matches("[0-9a-zA-Z][\\dA-z-_.]+@([A-z\\d][A-z\\d-]+\\.){1,6}[A-z]{2,6}");
    }

    public boolean isSubject () {
        if (subject == null) return false;
        return true;
    }

}
