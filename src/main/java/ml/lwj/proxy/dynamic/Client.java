package ml.lwj.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        // 创建一个目标对象
        ITeacherDao teacherDao = new TeacherDao();

        // 给目标对象创建代理对象
        ITeacherDao instance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();

        // class com.sun.proxy.$Proxy0 内存中到那个太生成了代理对象
        System.out.println(instance.getClass());

        // 通过代理对象，调用目标对象的方法
        instance.teach();

        instance.sayHello("tom");
    }
}
