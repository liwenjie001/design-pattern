package ml.lwj.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //1. 先点一份 longBlack
        Drink order = new LongBlack();

        System.out.println(order.getPrice());
        System.out.println(order.getDes());
        // 2. 加一份牛奶
        Drink milk = new Milk(order);
        System.out.println(milk.getPrice());
        System.out.println(milk.getDes());
    }
}
