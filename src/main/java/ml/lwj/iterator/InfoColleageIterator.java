package ml.lwj.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator {
    List<Department> departmentList; // 信息工程学院是以List方式存放系的

    int index = -1; // 索引

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() -1 ){
            return false;
        } else {
            index += 1;
            return true;
        }

    }

    @Override
    public Object next() {

        return departmentList.get(index);
    }

    // 空实现 remove 方法
    public  void remove(){

    }
}
