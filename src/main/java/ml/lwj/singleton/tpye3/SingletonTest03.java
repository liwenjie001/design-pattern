package ml.lwj.singleton.tpye3;

/**
 *  懒汉式 (线程不安全)
 *  优点：懒加载效果
 *  缺点：只能在单线程中使用 多线程不安全
 *  在实际开发中不能使用这种方式
 */
public class SingletonTest03 {
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

    // 提供一个静态的共有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}