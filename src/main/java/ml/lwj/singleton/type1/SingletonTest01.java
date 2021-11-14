package ml.lwj.singleton.type1;

/**
 * 饿汉式
 * 这种单例模式可以使用，但是可能造成内存的浪费
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2 == instance); // true
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}
// 饿汉式饿汉式 (静态变量)
class Singleton{
    // 1. 构造器私有化，外部不能new
    private Singleton(){}
    // 2.本类内部创建对象实例
    private  final  static  Singleton instance = new Singleton();

    //3. 对外提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
