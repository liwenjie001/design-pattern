package ml.lwj.proxy.dynamic.cglib;

public class TeacherDao {
    public String teach(){
        System.out.println("老师授课中 ,我是cglib代理不需要实现接口");
        return "hello";
    }
}
