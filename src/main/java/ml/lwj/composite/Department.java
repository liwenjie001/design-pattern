package ml.lwj.composite;

// 这个是 叶子节点，就不需要写 add和 remove 方法
public class Department extends  OrganizationComponent {


    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getDes() {
        return super.getDes();

    }

    @Override
    public String getName() {
        return super.getName();
    }
}
