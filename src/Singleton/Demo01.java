package Singleton;

/**
 * @author KIKOFranklin
 * @create 2021/3/31 0031 21:04
 * @apiNote 该方法线程不安全 只适合单线程场景下
 */
public class Demo01 {
    //本类内部创建对象实例
    private static Demo01 instance = null;

    /**
     * 私有化构造器 外部不能new
     */
    private Demo01(){}

    /**
     * 提供一个公有的静态方法，返回实例对象
     */
    public static Demo01 getInstance(){
        if(instance == null){
            instance = new Demo01();
        }
        return instance;
    }

}
