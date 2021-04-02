package Factory.Demo02;

/**
 * @author KIKOFranklin
 * @create 2021/4/2 0002 20:05
 */
public class Test {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        senderFactory.produceMailSender().send();
        senderFactory.produceSmsSender().send();
    }
}
