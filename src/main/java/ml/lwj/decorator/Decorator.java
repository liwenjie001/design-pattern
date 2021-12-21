package ml.lwj.decorator;

/**
 * 装饰者
 */
public class Decorator extends Drink {
    private Drink obl;

    public Decorator(Drink obl) { // 聚合
        this.obl = obl;
    }

    @Override
    public float cost() {
        // getPrice() 自己的价格
        return super.getPrice() + obl.cost() ;
    }

    @Override
    public String getDes() {
        //  obl.getDes() 是被装饰者的信息
        return super.getDes() + " " + super.getPrice() + " && " + obl.getDes();
    }
}
