package adapter;

/**
 * 适配器
 * 让火鸡适配到鸭子上（火鸡冒充鸭子），具有鸭子的能力
 * 首先实现要要冒充的接口，然后在适配器里做一层包装
 */
//  首先要实现想要转换（冒充）的Duck接口
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    //  取得适配对象的引用，使用构造器取得引用
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //  实现duck接口的方法
    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        //  火鸡没有鸭子飞的远，所以让火鸡连飞5次
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
