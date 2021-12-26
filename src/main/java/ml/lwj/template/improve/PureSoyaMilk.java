package ml.lwj.template.improve;

/**
 * 存豆浆
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        // 空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
