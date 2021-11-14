package ml.lwj.factory.absfactory.pizzstore.order;

import ml.lwj.factory.absfactory.pizzstore.pizza.BJCheesePizza;
import ml.lwj.factory.absfactory.pizzstore.pizza.BJPepperPizza;
import ml.lwj.factory.absfactory.pizzstore.pizza.Pizza;



public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if(orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
