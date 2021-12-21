package ml.lwj.decorator;

public class Milk extends Decorator{
    public Milk(Drink obl) {
        super(obl);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
