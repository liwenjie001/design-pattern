package ml.lwj.factory.factorymethod.pizzstore.order;



import ml.lwj.factory.factorymethod.pizzstore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    // 定义一个抽象方法
    abstract Pizza createPizza(String orderType);
    // 构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            pizza = createPizza(orderType); // 抽象的方法，由工厂的子类完成
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
