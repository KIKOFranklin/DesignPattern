package Singleton;

/**
 * @author KIKOFranklin
 * @create 2021/3/31 0031 21:30
 * @apiNote 当getInstance方法第一次被调用的时候, 它第一次读取SingletonHolder.instance，
 *          导致SingletonHolder类得到初始化；而这个类在装载并被初始化的时候，会初始化它的静态域，
 *          从而创建Singleton的实例，由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性
 */
public class Demo04 {

    private static class Demo04Holer{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Demo04 instance = new Demo04();

    }

    private Demo04(){}

    public static Demo04 getInstance(){
        return Demo04Holer.instance;
    }


}
