package ml.lwj.proxy.dynamic.cglib;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao target = new TeacherDao();
        // 获取代理对象，并将目标对象床给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        // 执行代理对象的发昂发，触发intecept 方法，从而实现对目标对象的调用
        String teach = proxyInstance.teach();
    }
}

