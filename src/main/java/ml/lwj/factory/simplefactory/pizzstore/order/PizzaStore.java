package ml.lwj.factory.simplefactory.pizzstore.order;

// 相当于一个客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());

    }
}
