package composite;

import java.util.Iterator;

/**
 * 空迭代器
 */
public class NullIterator implements Iterator<MenuComponent> {

    public MenuComponent next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}
