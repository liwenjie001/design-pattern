package ml.lwj.factory.simplefactory.pizzstore.order;

import ml.lwj.factory.simplefactory.pizzstore.pizza.CheesePizza;
import ml.lwj.factory.simplefactory.pizzstore.pizza.GreekPizza;
import ml.lwj.factory.simplefactory.pizzstore.pizza.PepperPizza;
import ml.lwj.factory.simplefactory.pizzstore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    // 构造器
//    public  OrderPizza(){
//        Pizza pizza = null;
//        String oiderType;// 订购披萨类型
//        do {
//            oiderType = getType();
//            if(oiderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊pizza");
//            } else if (oiderType.equals("cheese")){
//
//                pizza = new CheesePizza();
//                pizza.setName("奶酪pizza");
//            } else if(oiderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("胡椒pizza");
//            } else {
//                break;
//            }
//            // 输出pizza 制作国产
//            pizza.perpare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//
//    }
    // 定义一个简单工厂对象
    SimpleFactory simpleFactory ;
    Pizza pizza = null;

    // 构造器

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = ""; // 用户输入的

        this.simpleFactory = simpleFactory; // 设置一个简单工厂对象

        do {
          orderType = getType();
          this.simpleFactory.createPizza(orderType);
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
