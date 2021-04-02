package Factory.AbstractFactory.Demo01;

/**
 * @author KIKOFranklin
 * @create 2021/4/2 0002 20:46
 */
public class Test {

    @AutoGenerate
    

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        FactorySelector factorySelector = (FactorySelector) BeanGenerator.getBean(FactorySelector.class);

        factorySelector.getFactory("mail").produce().send();

        factorySelector.getFactory("sms").produce().send();
    }
}
