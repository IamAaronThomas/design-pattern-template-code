package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 所有者的代理调用处理器
 */
public class OwnerInvocationHandler implements InvocationHandler {
    Person person;

    //  将person对象传入构造器，保持它的引用
    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    //  每次proxy的方法被调用，就会执行这里
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);

            } else if (method.getName().equals("setGeekRating")) {
                throw new IllegalAccessException();

            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
