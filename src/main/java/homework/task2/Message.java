package homework.task2;

abstract public class Message {
    private final String content;

    public Message(String content) {
        this.content = content;
    }

    abstract public String send();

    public boolean canSend() {
        if (this.content == null || this.content == "" || this.content.length() < 5) {
            return false;
        }
            return true;
        }

    public String getContent() {
        return content;
    }
}