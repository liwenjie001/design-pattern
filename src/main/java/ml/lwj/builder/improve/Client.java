package ml.lwj.builder.improve;

public class Client {
    public static void main(String[] args) {
        // 盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 完成盖房，返回产品
        House house = houseDirector.constructHose();

        // 盖高楼
        HighHouse highHouse = new HighHouse();
        // 重至建造者
        houseDirector.setHouseBuilder(highHouse);
        // 完成盖房子，返回产品（高楼）
        houseDirector.constructHose();

        //
    }
}
