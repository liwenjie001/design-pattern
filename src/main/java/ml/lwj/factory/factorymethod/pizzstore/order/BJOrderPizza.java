package ml.lwj.factory.factorymethod.pizzstore.order;

import ml.lwj.factory.factorymethod.pizzstore.pizza.BJCheesePizza;
import ml.lwj.factory.factorymethod.pizzstore.pizza.BJPepperPizza;
import ml.lwj.factory.factorymethod.pizzstore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
