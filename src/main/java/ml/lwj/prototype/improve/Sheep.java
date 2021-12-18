package ml.lwj.prototype.improve;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";
    public Sheep friend;// 是对象，克隆是会如何处理

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
    /*
      克隆使用默认的方法
      这种是潜拷贝
     */
    @Override
    protected Sheep clone() {

        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
