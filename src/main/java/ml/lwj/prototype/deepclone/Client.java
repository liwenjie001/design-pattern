package ml.lwj.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p1 = new DeepProtoType();
        p1.name = "松江";
        p1.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛的类");
        // 方式1 看看完成深拷贝

//        DeepProtoType p2 = (DeepProtoType) p1.clone();
//
//        System.out.println("p1.name = " + p1.name + " p.deepCloneableTarget = " + p1.deepCloneableTarget.hashCode());
//        System.out.println("p1.name = " + p2.name + " p.deepCloneableTarget = " + p2.deepCloneableTarget.hashCode());
        // 使用方式二 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p1.deepClone();

        System.out.println("p1.name = " + p1.name + " p.deepCloneableTarget = " + p1.deepCloneableTarget.hashCode());
        System.out.println("p1.name = " + p2.name + " p.deepCloneableTarget = " + p2.deepCloneableTarget.hashCode());

    }
}
