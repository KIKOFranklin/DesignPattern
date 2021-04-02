package Factory.Demo01;

/**
 * @author KIKOFranklin
 * @create 2021/4/2 0002 20:03
 */
public class SenderFactory {
    /**
     * 工厂生产方法.
     * @param type 生产类型
     * @return Sender
     */
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.err.println("请输入正确的类型");
            return null;
        }
    }

}
