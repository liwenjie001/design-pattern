package ml.lwj.factory.absfactory.pizzstore.pizza;

import ml.lwj.factory.absfactory.pizzstore.pizza.Pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void perpare() {
        setName("伦敦的胡椒披萨");
        System.out.println("伦敦的胡椒披萨准备原材料");
    }
}
