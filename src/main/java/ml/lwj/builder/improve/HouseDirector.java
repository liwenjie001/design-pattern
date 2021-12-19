package ml.lwj.builder.improve;

// 指挥者，这里动态的去指定制作流程，返回产品
public class HouseDirector {
    HouseBuilder houseBuilder = null;
    // 构造器传入


    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    // 通过 setter 传入 houseBuider

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //  如何处理建造房子的流程，交给指挥者

    public House constructHose(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
