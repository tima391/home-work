package lab7H;

public class ChatMain {
    public static void main(String[] args) {
        IMediator chat = new ChatRoom();

        User user1 = new ChatUser(chat, "Тимур");
        User user2 = new ChatUser(chat, "Алексей");
        User user3 = new ChatUser(chat, "Мария");

        chat.registerUser(user1);
        chat.registerUser(user2);
        chat.registerUser(user3);

        user1.send("Привет всем!");
    }
}