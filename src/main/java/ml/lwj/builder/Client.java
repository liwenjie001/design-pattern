package ml.lwj.builder;

/**
 * 使用传统的抽象类进行创建
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
