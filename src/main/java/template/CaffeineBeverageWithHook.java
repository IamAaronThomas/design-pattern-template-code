package template;

/**
 * 咖啡因饮料	带钩子
 */
public abstract class CaffeineBeverageWithHook {

    //  prepareRecipe()是模板方法,定义了执行一套模板的顺序
    //  在这套模板中，子类共同的行为基类中处理
    //  子类不同的行为，定义成抽象方法，在不同的子类中各自处理
    //  准备食谱
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //  如果顾客想要调料，才添加调料 调用钩子
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    //  酿造
    abstract void brew();

    //  添加调料
    abstract void addCondiments();

    //  烧水
    void boilWater() {
        System.out.println("烧好水");
    }

    //  装杯
    void pourInCup() {
        System.out.println("倒杯中");
    }

    //  这个就是钩子，子类可以选择覆盖这个方法，也可以选择不覆盖
    boolean customerWantsCondiments() {
        return true;
    }
}
