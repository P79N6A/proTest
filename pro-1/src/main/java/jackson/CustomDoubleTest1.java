package jackson;
/**
 * 解析对象成json String
 * 1.不使用注解，将直接使用默认解析
 * 2.使用注释，将按自定义注解解析
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.*;
//可以将注解注释或者打开，看序列化的结果
@JsonSerialize(using = CustomBeanSerialize.class)
public class CustomDoubleTest1 {
    private int id;
    private String name;
    private List<CustomDoubleTest> list;
    private Map<Integer,String> pair;
    private Set<String> set;
    private Boolean flag;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CustomDoubleTest> getList() {
        return list;
    }

    public void setList(List<CustomDoubleTest> list) {
        this.list = list;
    }

    public Map<Integer, String> getPair() {
        return pair;
    }

    public void setPair(Map<Integer, String> pair) {
        this.pair = pair;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) {
        CustomDoubleTest1 t = new CustomDoubleTest1();
        // 给对象t赋值
        t.setId(1);
        t.setName("hobe");

        Map pair = new HashMap();
        pair.put(1,"wang");
        pair.put(2,"hong");
        pair.put(3,"bing");
        t.setPair(pair);

        List<CustomDoubleTest> list = new ArrayList<>();
        list.add(new CustomDoubleTest());
        t.setList(list);

        Set<String> set = new HashSet();
        set.add("whbing.cn");
        t.setSet(set);

        t.setFlag(true);

        try {
            /**
             * com.fasterxml.jackson.databind.ObjectMapper
             * 仅一个方法即可【将对象解析成json字符串】
             */
            String serialized = new ObjectMapper().writeValueAsString(t);
            // 只有在调用序列化方法时，才会触发该注解。
            System.out.println(serialized);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
