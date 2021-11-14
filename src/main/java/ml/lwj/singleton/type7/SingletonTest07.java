package ml.lwj.singleton.type7;

/**
 *  枚举
 *  优点：多线程安全，并且可以防止反序列化重新创建实例
 *  推荐使用
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance2 == instance);
        instance.sayOK();
    }
}

// 枚举可以实现单例ss
enum Singleton {
    INSTANCE; // 属性
    public void  sayOK(){
        System.out.println("ok");
    }
}