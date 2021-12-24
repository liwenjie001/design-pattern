package ml.lwj.staticproxy;

public class TeacherDao implements ITeacherDao{
    @Override
    public void tech() {
        System.out.println("老师授课中");
    }
}
