package Singleton;

/**
 * @author KIKOFranklin
 * @create 2021/3/31 0031 21:11
 * @apiNote 线程安全版的懒汉单例模式 双重检查 + 锁
 */
public class Demo02 {
    private volatile static Demo02 instance = null;

    //私有化构造器
    private Demo02(){}

    public static Demo02 getInstance(){
        if(instance == null){
            synchronized (Demo02.class){
                if(instance == null){
                    instance = new Demo02();
                }
            }
        }
        return instance;
    }
}
