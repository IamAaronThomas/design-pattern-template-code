package adapter;

/**
 * 火鸡接口
 * 使用适配器，让火鸡冒充鸭子（让火鸡也有鸭子一样的叫和飞的能力）
 */
public interface Turkey {
    //  咯咯叫
    public void gobble();

    public void fly();
}
