package ml.lwj.factory.simplefactory.pizzstore.order;

import ml.lwj.factory.simplefactory.pizzstore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 使用静态工厂类
public class OrderPizza2 {
    Pizza pizza = null;

    // 构造器
    String orderType = "";
    public OrderPizza2(){
        do {
            orderType = getType();
            SimpleFactory.createPizza2(orderType);
            // 输出pizza
            if(pizza != null){
                pizza.perpare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
            }
        } while (true);

    }
    // 写一个方法动态获取客服希望订购的披萨种类
    private String getType() {
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入 pizza 种类：");
            String str = strin.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
