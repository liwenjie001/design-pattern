package ml.lwj.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    // 这个List 中存放的是 Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    // 构造器
    public College(String name, String des) {
        super(name, des);
    }
    // 重写 add 方法


    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 将来实际业务中，College 的 add 和 University 不同
        organizationComponents.add(organizationComponent);
    }
    // 重写 remove


    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
    // 输出 University 所包含的学院
    @Override
    protected void print() {
        System.out.println(getName());
        // 便利 organizationComponents
        for(OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }
}
