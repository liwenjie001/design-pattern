package ml.lwj.decorator;

// 具体的装饰着.这里就是具体的装饰品
public class Chocolate extends Decorator{

    public Chocolate(Drink obl) {
        super(obl);
        setDes(" 巧克力");
        setPrice(3.0f); // 调味品的 价格
    }
}
