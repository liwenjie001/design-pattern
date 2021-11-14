package ml.lwj.factory.absfactory.pizzstore.pizza;

import ml.lwj.factory.absfactory.pizzstore.pizza.Pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void perpare() {
        setName("北京的奶酪披萨");
        System.out.println("北京的奶酪披萨准备原材料");
    }
}
