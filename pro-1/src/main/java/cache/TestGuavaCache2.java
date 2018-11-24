package cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class TestGuavaCache2 {
    public static void main(String[] args) throws Exception{
        final List<Person> list = new ArrayList<Person>(5);
        list.add(new Person("1", "zhangsan"));
        list.add(new Person("2", "lisi"));
        list.add(new Person("3", "wangwu"));
        final String key = "1";
        Cache<String, Person> cache2 = CacheBuilder.newBuilder().maximumSize(1000).build();
        /**
         * 用缓存中的get方法，当缓存命中时直接返回结果;否则，通过给定的Callable类call方法获取结果并将结果缓存。<br/>
         * 可以用一个cache对象缓存多种不同的数据，只需创建不同的Callable对象即可。
         */
        Person person1 = cache2.get(key, new Callable<Person>() {
            public Person call() throws ExecutionException {
                System.out.println(key + " load in cache");
                return getPerson(key);
            }
            // 此时一般我们会进行相关处理，如到数据库去查询
            private Person getPerson(String key) throws ExecutionException {
                System.out.println(key + " query");
                for (Person p : list) {
                    if (p.getId().equals(key))
                        return p;
                }
                return null;
            }
        });
        System.out.println(person1.name);
        System.out.println("======= sencond time  ==========");
        Person person2 = cache2.getIfPresent(key);
        System.out.println(person2.name);
        Person person3 = cache2.getIfPresent(key);
        System.out.println(person3.name);

    }


}
