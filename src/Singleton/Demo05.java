package Singleton;

/**
 * @author KIKOFranklin
 * @create 2021/3/31 0031 21:33
 */
public enum Demo05 {
    uniqueInstance,red;// 定义一个枚举的元素，它 就代表了Singleton的一个实例


    public void singletonOperation() {
        // 功能处理
        System.err.println("功能处理");
    }

    public static void main(String[] args) {
        Demo05 demo05 = Demo05.uniqueInstance;
        Demo05 demo051 = Demo05.red;
        demo05.singletonOperation();
        demo051.singletonOperation();
    }
}

