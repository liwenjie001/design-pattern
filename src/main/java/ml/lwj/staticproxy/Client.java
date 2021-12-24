package ml.lwj.staticproxy;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        // 创建代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        // 通过代理对象，调用被代理对象的方法

        teacherDaoProxy.tech();
    }
}
