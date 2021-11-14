package ml.lwj.factory.simplefactory.pizzstore.order;

import ml.lwj.factory.simplefactory.pizzstore.pizza.CheesePizza;
import ml.lwj.factory.simplefactory.pizzstore.pizza.GreekPizza;
import ml.lwj.factory.simplefactory.pizzstore.pizza.PepperPizza;
import ml.lwj.factory.simplefactory.pizzstore.pizza.Pizza;

/**
 * 简单工厂模式
 */
public class SimpleFactory {

    // 根据orderType 返回对应的Pizza对象

    public Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza = null ;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊pizza");
        } else if (orderType.equals("cheese")){

            pizza = new CheesePizza();
            pizza.setName("奶酪pizza");
        } else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒pizza");
        }
        return pizza;
    }
    // 简单工厂模式 也叫静态工厂模式
    public static Pizza createPizza2(String orderType){
        System.out.println("使用简单工厂模式2");
        Pizza pizza = null ;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊pizza");
        } else if (orderType.equals("cheese")){

            pizza = new CheesePizza();
            pizza.setName("奶酪pizza");
        } else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒pizza");
        }
        return pizza;
    }

}
