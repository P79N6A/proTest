package myAnnotation;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;

import java.beans.MethodDescriptor;
import java.util.Arrays;

@MyTag(likes = {"code","ball"})
public class Demo {
    private String name;
    private Integer age;
    private String[] likes;
    private Sex sex;

    public static void main(String[] args) {
        Demo demo = new Demo();
        /** 仅仅注解，并不能将值赋给Demo的字段 */
        System.out.println(demo);

        boolean hasAnnotation = Demo.class.isAnnotationPresent(MyTag.class);
        if (hasAnnotation){
            MyTag myTag = Demo.class.getAnnotation(MyTag.class);
            System.out.println(myTag.name());
            System.out.println(myTag.likes());
            System.out.println(myTag.sex());
            System.out.println(myTag.age());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getLikes() {
        return likes;
    }

    public void setLikes(String[] likes) {
        this.likes = likes;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", likes=" + Arrays.toString(likes) +
                ", sex=" + sex +
                '}';
    }
}
