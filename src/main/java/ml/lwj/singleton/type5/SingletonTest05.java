package ml.lwj.singleton.type5;

/**
 *  懒汉式 双重检验方法 (线程安全)
 *  优点：懒加载效果，线程安全，效率比较高
 *  推荐使用
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2 == instance); // true
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}

class Singleton{
    // volatile 保证线程的可见性。
    private static volatile   Singleton instance;

    private Singleton(){}

    // 提供一个静态的共有方法，加入了双重检查代码，解决线程安全问题，同时解决懒加载问题
    // 同时保证效率
    public static  Singleton getInstance(){
        // 避免了进行反复的方法同步
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}