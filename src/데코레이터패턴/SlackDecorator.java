package 데코레이터패턴;

public class SlackDecorator extends NotifierDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {

        notifier.send(message);

        System.out.println("Slack 발송");
    }
}
