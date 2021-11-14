package ml.lwj.factory.absfactory.pizzstore.order;

import ml.lwj.factory.absfactory.pizzstore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory absFactory ;

    public OrderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }

    private   void  setFactory (AbsFactory factory){
        Pizza pizza = null;
        String orderType = ""; // 用户输入
        do {
            orderType = getType();
            // factory 可能是北京的也可能是伦敦的
            pizza = factory.createPizza(orderType);
            if(pizza != null) {
                pizza.perpare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true) ;

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
