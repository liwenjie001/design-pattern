package ml.lwj.adapter.objectdapter;

// 适配器类
public class VoltageAdapter  implements IVoltage5V {
    // 关联关系中的聚合关系
    private Voltage220V voltage220V;

    // 使用构造器进行关联
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (null != voltage220V){
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配");
            dstV = srcV / 44; // 转成5V
            System.out.println("适配完成，输出的电压为="+dstV);

        }

        return dstV;

    }
}
