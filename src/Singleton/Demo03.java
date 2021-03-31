package Singleton;

/**
 * @author KIKOFranklin
 * @create 2021/3/31 0031 21:28
 * @apiNote 饿汉式单例模式
 */
public class Demo03 {
    private static Demo03 instance = new Demo03();

    // 私有化构造方法
    private Demo03(){}

    public static Demo03 getInstance(){
        return instance;
    }
}
