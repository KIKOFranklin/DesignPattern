package Singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author KIKOFranklin
 * @create 2021/3/31 0031 22:49
 * @apiNote 解决方案
 */
public class Demo07 {
    public static void main(String[] args) throws Exception{

        System.out.println("-----------序列化----------------------");
        Singleton originSingleton = Singleton.getInstance();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(Singleton.getInstance());
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Singleton serializeSingleton = (Singleton) ois.readObject();
        System.out.println(originSingleton == serializeSingleton);//false

        System.out.println("-----------反射----------------------");
        //通过反射获取
        Constructor<Singleton> cons = Singleton.class.getDeclaredConstructor();
        cons.setAccessible(true);
        Singleton reflextSingleton = cons.newInstance();
        System.out.println(reflextSingleton == originSingleton);//false

        System.out.println("---------------------------克隆----------------------");

        Singleton cloneSingleton = (Singleton) originSingleton.clone();
        System.out.println(cloneSingleton == originSingleton);//false

    }

    private static class Singleton  implements Serializable,Cloneable{

        private static volatile boolean isCreate = false;//默认是第一次创建
        /**
         * 1.构造方法私有化，外部不能new
         */
        private Singleton() {
            if(isCreate) {
                throw new RuntimeException("已然被实例化一次，不能在实例化");
            }
            isCreate = true;
        }


        //2.本类内部创建对象实例
        private static  volatile  Singleton instance;


        //3.提供一个公有的静态方法，返回实例对象
        public static  Singleton getInstance() {
            if(instance == null) {
                synchronized (Singleton.class) {
                    if(instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return instance;
        }

        /**
         * 防止序列化破环
         * @return
         */
        private Object readResolve() {
            return instance;
        }

    }
}
