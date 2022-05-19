package proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * 用代理模式，同时还能限制代理能修改哪些数据、不能修改哪些数据
 */
public class Main {
    Map<String, Person> datingDB = new HashMap<String, Person>();

    public Main() {
        initializeDatabase();
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.drive();
    }

    public void drive() {
        //  取出一个person对象
        Person joe = getPersonFromDatabase("Joe Javabean");
        //  给这个对象创建代理
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("创建代理：" + ownerProxy.getName());

        ownerProxy.setInterests("设置兴趣");
        System.out.println("能够设置兴趣");
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("不能设置评级");
        }

    }

    //  创建代理
    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    Person getPersonFromDatabase(String name) {
        return (Person) datingDB.get(name);
    }

    void initializeDatabase() {
        Person joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setGeekRating(7);
        datingDB.put(joe.getName(), joe);

        Person kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setGeekRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
