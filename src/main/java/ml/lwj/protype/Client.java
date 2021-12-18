package ml.lwj.protype;

public class Client {
    public static void main(String[] args) {
        // 传统的方法
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);

        // 原型模式
        Sheep clone = sheep.clone();
        System.out.println(clone);
    }
}
