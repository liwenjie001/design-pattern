package ml.lwj.template;

import ml.lwj.decorator.Soy;

public class PeanutSoyMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好的花生");
    }
}
