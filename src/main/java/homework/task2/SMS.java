package homework.task2;

import java.util.regex.Pattern;

public class SMS extends Message {

    final String phoneNumber;

    public SMS(String content) {
        super(content);
        phoneNumber = "";
    }

    public SMS(String content, String phoneNumber) {
        super(content);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String send() {
        if (canSend()) return "SMS o treści: " + getContent() + " został wysłany na numer: " + this.phoneNumber;
            return "SMS nie może zostać wysłany";
    }

    @Override
    public boolean canSend() {
        if (phoneNumber == null) return false;
        return super.canSend() && (Pattern.matches("\\d{3}\\s?\\d{3}\\s?\\d{3}\\s?", phoneNumber));
    }

}



