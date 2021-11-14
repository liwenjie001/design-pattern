package ml.lwj.factory.simplefactory.pizzstore.pizza;

// 将 pizza 类做成抽象的
public abstract class Pizza {
    protected  String name; // 名字
    // 准备原材料，不同的披萨不一样，因此我们做成抽象方法
    public abstract void perpare();
    public void bake() {
        System.out.println(name + " baking");
    }

    public void  cut(){
        System.out.println(name + " cutting");
    }
    // 打包
    public void box() {
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
