package ml.lwj.prototype.improve;

import ml.lwj.prototype.improve.Sheep;

public class Client {
    public static void main(String[] args) {
        // 传统的方法
        Sheep sheep =  new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack",2,"黑色");

        // 原型模式
        Sheep clone1 = sheep.clone();
        Sheep clone2 = sheep.clone();
        System.out.println("clone1 =" + clone1 + "clone1.friend = " + clone1.friend.hashCode());
        System.out.println("clone1 =" + clone2 + "clone1.friend = " + clone2.friend.hashCode());
    }
}
