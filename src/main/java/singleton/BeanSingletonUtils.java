package singleton;

import net.sf.cglib.beans.BeanCopier;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式
 * 双重检查机制
 */
public class BeanSingletonUtils {
    /**
     * 缓存
     */
    public static Map<String, BeanCopier> beanCopierCacheMap = new HashMap<>();

    /**
     * 将source对象的属性拷贝到target对象
     *
     * @param source the source 来源对象
     * @param target the target 目标对象
     */
    public static void copy(Object source, Object target) {
        String cacheKey = source.getClass().toString() + target.getClass().toString();
        BeanCopier beanCopier = null;
        //  线程1和线程2同时进来,先判断缓存里有没有实例
        if (!beanCopierCacheMap.containsKey(cacheKey)) {
            //  缓存里没有，2个线程都进入
            //  线程1先获取到锁，线程2在这里等着
            synchronized (BeanSingletonUtils.class) {
                //  第一次：线程1进来以后，发现这里还是没有BeanCopier实例,线程1就会接着进入
                //  第二次：接着线程2进来，缓存里有这个实例了，直接去else取出缓存后返回
                if (!beanCopierCacheMap.containsKey(cacheKey)) {
                    //  第一次：线程1进入这里,创建一个BeanCopier实例，放在缓存中,线程1执行结束。
                    beanCopier = BeanCopier.create(source.getClass(), target.getClass(), false);
                    beanCopierCacheMap.put(cacheKey, beanCopier);
                } else {
                    //  从缓存里获取实例
                    beanCopier = beanCopierCacheMap.get(cacheKey);
                }
            }
        }
        //  缓存里有这个实例，直接使用
        else {
            beanCopier = beanCopierCacheMap.get(cacheKey);
        }
    }
}
