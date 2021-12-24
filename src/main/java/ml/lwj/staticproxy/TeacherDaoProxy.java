package ml.lwj.staticproxy;

// 代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target; // 目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void tech() {
        System.out.println("代理开始 完成某些操作");
        target.tech();
        System.out.println("提交");
    }
}
