package ml.lwj.template;

import java.sql.SQLOutput;

public class RedBeanSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("加入上号的红豆");
    }
}
