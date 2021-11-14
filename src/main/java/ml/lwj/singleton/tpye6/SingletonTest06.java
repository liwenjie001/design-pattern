package ml.lwj.singleton.tpye6;

/**
 *  静态内部类 单例模式
 *  优点：静态内部类在jvm 开始的时候不进行装载，只有在使用的时候才会创建，并且线程安全的 （懒加载 + 线程安全）
 *
 *  推荐使用
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2 == instance); // true
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}
// 静态内部类
class Singleton{

    private Singleton(){}

    // 写一个静态内部类，该类中有一个静态的属性Singleton
    private  static  class SingletonInstance {
        private static final  Singleton INSTANCE = new Singleton();
    }

    public static  Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}