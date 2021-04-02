package Factory.Demo01;

/**
 * @author KIKOFranklin
 * @create 2021/4/2 0002 20:02
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is SmsSender!");
    }
}
