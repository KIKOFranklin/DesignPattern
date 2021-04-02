package Factory.Demo03;

/**
 * @author KIKOFranklin
 * @create 2021/4/2 0002 20:01
 * @apiNote 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("This is mailSender!");
    }
}
