package qualifier;

public class TwitterService implements MessageService{

    public void sendMsg(String message) {
        System.out.println(message);
    }
}
