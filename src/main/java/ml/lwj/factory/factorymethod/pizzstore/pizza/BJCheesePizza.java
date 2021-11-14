package ml.lwj.factory.factorymethod.pizzstore.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void perpare() {
        setName("北京的奶酪披萨");
        System.out.println("北京的奶酪披萨准备原材料");
    }
}
