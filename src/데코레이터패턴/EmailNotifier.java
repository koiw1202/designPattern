package 데코레이터패턴;

public class EmailNotifier implements Notifier  {

    @Override
    public void send(String message) {
        System.out.println("message 발송 => " + message);
    }
}
