package Factory.Demo03;

/**
 * @author KIKOFranklin
 * @create 2021/4/2 0002 20:03
 */
public class SenderFactory {
    /**
     * mailSender生产方法
     * @return Sender
     */
    public static Sender produceMailSender(){
        return new MailSender();
    }

    /**
     * smsSender 生产方法
     * @return sender
     */
    public static Sender produceSmsSender(){
        return new SmsSender();
    }

}
