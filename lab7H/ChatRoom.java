package lab7H;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for (User u : users) {
            if (u != sender) {
                u.receive(msg);
            }
        }
    }
}
