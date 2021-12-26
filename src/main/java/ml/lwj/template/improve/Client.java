package ml.lwj.template.improve;

public class Client {
    public static void main(String[] args) {
        // 制作红豆豆浆

        System.out.println("--------制作红豆豆浆--------");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println("--------制作花生豆浆--------");
        SoyaMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
        System.out.println("--------制作存豆浆--------");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();

    }
}
