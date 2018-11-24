package cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class TestGuavaCache3 {
    private Cache<String, String> TEST_STRING_CACHE = CacheBuilder.newBuilder()
            .maximumSize(200000)
            .expireAfterWrite(5, TimeUnit.MINUTES)
            .build();
    /**定义一个方法用于获取STRING值，注意，直接从定义的TEST_STRING_CACHE中获取即可，
     * 第一次会通过回调从数据库中获取，后续就从缓存
     */
    private String getValue(String key){
        try {
            return TEST_STRING_CACHE.get(key,()->{
                if(key.equals("1")){
                    System.out.println("first get v1");
                    return "v1";
                }
                if(key.equals("2")){
                    System.out.println("first get v2");
                    return "v2";
                }
                System.out.println("first get other");
                return "other";
            });
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return "error";
    }

    public static void main(String[] args) {
        TestGuavaCache3 t=new TestGuavaCache3();
        System.out.println(t.getValue("1")); //首次会使用回调
        System.out.println(t.getValue("1")); //第二次，不会使用回调
        System.out.println(t.getValue("2"));
        System.out.println(t.getValue("2"));
        System.out.println(t.getValue("3"));
        System.out.println(t.getValue("3"));
    }

}
