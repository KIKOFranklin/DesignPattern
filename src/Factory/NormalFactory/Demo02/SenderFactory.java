package Factory.Demo02;

/**
 * @author KIKOFranklin
 * @create 2021/4/2 0002 20:03
 */
public class SenderFactory {
    /**
     * mailSender生产方法
     * @return Sender
     */
    public Sender produceMailSender(){
        return new MailSender();
    }

    /**
     * smsSender 生产方法
     * @return sender
     */
    public Sender produceSmsSender(){
        return new SmsSender();
    }

}
