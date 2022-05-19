package decorator;

import decorator.Coffee;

/**
 * 装饰者
 * 配料类
 */
public abstract class CondimentDecorator extends Coffee {
    Coffee coffee;

    //  所有的配料装饰者必须重新实现getDescription方法
    public abstract String getDescription();
}
