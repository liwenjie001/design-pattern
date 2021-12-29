package ml.lwj.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{

    Department[] departments;
    int numOfDepartment = 0; // 保存当前数组的对象个数
    @Override
    public String getName() {
        return "计算机学院";
    }

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业","java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");
        addDepartment("安卓专业","安卓专业");
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
