package ml.lwj.factory.simplefactory.pizzstore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void perpare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
