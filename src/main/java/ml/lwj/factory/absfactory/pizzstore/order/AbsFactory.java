package ml.lwj.factory.absfactory.pizzstore.order;

import ml.lwj.factory.absfactory.pizzstore.pizza.Pizza;

// 一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {
    // 让下面的工厂之类具体实现
    public Pizza createPizza (String orderType);
}
