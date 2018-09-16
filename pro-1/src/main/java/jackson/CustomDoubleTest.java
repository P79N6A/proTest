package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 自定义注解，将Double类型的price字段以两位小数显示
 */
public class CustomDoubleTest {
    /**
     * 该注解可以放在字段、getter或setter上
     */
    @JsonSerialize(using = CustomDoubleSerialize.class)
    private Double price;
    private String name;


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomDoubleTest{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CustomDoubleTest t = new CustomDoubleTest();
        t.setPrice(3.14159);
        /** 1.直接打印被注解的字段，即使有注解也不起作用 */
        System.out.println("不调用序列化方法即使有注解也不会生效:"+t.getPrice());
        /** 2.直接打印对象，按toString打印。即使有注解也不起作用 */
        System.out.println(t);
        try {
            /** 该方法调用序列化方法，会以json格式展示
             *  1.如果没有注解，仍然按默认的json格式展示
             *  2.如果有注解（打开注释），按注解格式展示
             * */
            String serialized = new ObjectMapper().writeValueAsString(t);
            // 3.只有在调用序列化方法时，才会触发该注解。
            System.out.println("调用序列化方法后，注解才生效:"+serialized);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
