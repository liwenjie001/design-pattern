package ml.lwj.factory.factorymethod.pizzstore.pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void perpare() {
        setName("伦敦的奶酪披萨");
        System.out.println("伦敦的奶酪披萨准备原材料");
    }
}
