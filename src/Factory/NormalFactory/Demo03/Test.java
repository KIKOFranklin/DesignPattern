package Factory.Demo03;

/**
 * @author KIKOFranklin
 * @create 2021/4/2 0002 20:05
 */
public class Test {
    public static void main(String[] args) {
        SenderFactory.produceMailSender().send();
        SenderFactory.produceSmsSender().send();
    }
}
