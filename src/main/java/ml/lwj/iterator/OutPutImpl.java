package ml.lwj.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    // 学院的集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    // 便利所有的学院，然后调用printDepartment 输出各个学院的系
    public void printCollege(){
        // 从collegeList 取出所有学院，Java中的List已经实现了Iterator
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            // 取出学院
            College next = iterator.next();
            System.out.println("==========="+ next.getName()+"===========");
            printDeaprtment(next.createIterator()); // 得到对应的迭代器
        }
    }

    // 输出 学院输出系
    public void printDeaprtment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
