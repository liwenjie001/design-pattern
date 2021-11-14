package ml.lwj.factory;

import java.util.Calendar;

/**
 * 1. 简单工厂模式
 * 2. 工厂方法模式
 * 3. 抽象方法模式
 */
public class Test {
    public static void main(String[] args) {
//        Calendar
        // getInstance 是 Calendar 一个静态方法
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(1));

    }
}
