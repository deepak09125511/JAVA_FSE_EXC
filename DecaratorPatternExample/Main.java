interface Notifier{
    void send(String message);
}
class emailNotifier implements Notifier {

    public void send(String message) {
        System.out.println("email sent: " + message);
    }
}
abstract class notifierDecorator implements Notifier {

    protected Notifier notifier;

    public notifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message);
    }
}
class SMSnotifierDecorator extends notifierDecorator {

    public SMSnotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("SMS sent: " + message);
    }
}
class slackNotifierDecorator extends notifierDecorator {

    public slackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("slack message sent: " + message);
    }
}
public class Main {
    public static void main(String[] args) {

        Notifier notifier = new emailNotifier();
        notifier.send("hello...there");

        Notifier smsNotifier = new SMSnotifierDecorator(new emailNotifier());
        smsNotifier.send("hello...there");

        Notifier fullNotifier = new slackNotifierDecorator(
                                    new SMSnotifierDecorator(
                                        new emailNotifier()));
        fullNotifier.send("hello...there");
    }
}