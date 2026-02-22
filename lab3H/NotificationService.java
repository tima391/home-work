package lab3H;
import java.util.List;

public class NotificationService {
    private final List<MessageSender> senders;

    public NotificationService(List<MessageSender> senders) {
        this.senders = senders;
    }

    public void sendNotification(String message) {
        for (MessageSender sender : senders) {
            sender.send(message);
        }
    }
}

interface MessageSender {
    void send(String message);
}

class EmailSender implements MessageSender {
    public void send(String message) { System.out.println("Email sent: " + message); }
}

class SmsSender implements MessageSender {
    public void send(String message) { System.out.println("SMS sent: " + message); }
}