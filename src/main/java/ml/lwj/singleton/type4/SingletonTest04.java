package ml.lwj.singleton.type4;

/**
 *  懒汉式 (线程安全)
 *  优点：懒加载效果，线程安全
 *  缺点：方法进行同步效率太低
 *  在实际开发中这个方法虽然可用，但是效率太低，不推荐使用
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2 == instance); // true
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}

class Singleton{
    private static  Singleton instance;

    private Singleton(){}

    // 提供一个静态的共有方法，加入了同步处理的代码，解决了线程安全问题
    //即懒汉式
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}