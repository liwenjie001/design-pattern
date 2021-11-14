package ml.lwj.factory.absfactory.pizzstore.pizza;

import ml.lwj.factory.absfactory.pizzstore.pizza.Pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void perpare() {
        setName("伦敦的奶酪披萨");
        System.out.println("伦敦的奶酪披萨准备原材料");
    }
}
