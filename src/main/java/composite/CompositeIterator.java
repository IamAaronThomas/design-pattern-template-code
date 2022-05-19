package composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合迭代器
 * 组合模式+迭代器模式
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    //  传入将要遍历的顶层组合的迭代器
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    public MenuComponent next() {
        //  当要取得下一个元素时，先调用hasNext确定是否还有下一个
        if (hasNext()) {
            //  还有，就从堆栈种取出目前的迭代器，然后取出它的元素
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            //  给堆栈中放一个迭代器
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }

    //  判断堆栈是否被清空，就检查堆栈堆栈是否还有下一个元素
    public boolean hasNext() {
        if (stack.empty()) {
            //  如果已经空了，表示没有下一个元素
            return false;
        } else {
            //  返回下一个元素
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}


