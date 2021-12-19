package ml.lwj.builder.improve;

public class HighHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼切强20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼透明的屋顶");
    }
}
