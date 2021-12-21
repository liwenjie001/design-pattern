package ml.lwj.decorator;

public class Soy extends Decorator{
    public Soy(Drink obl) {

        super(obl);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
