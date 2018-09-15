import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ListToString {
    /** Java list 转字符串并加入分隔符的方法*/
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");

        String s=StringUtils.join(list.toArray(), ",");
        System.out.println(s);

        List l = new ArrayList();
        l.add(new T());
        l.add(new T());
        String ss=StringUtils.join(l.toArray(), ",");
        ss = "["+ss+"]";
        System.out.println(ss);
    }
    static class T{
        int a=0;
        String s="ss";

        @Override
        public String toString() {
            return "{" +
                    "a=" + a +
                    ", s=\"" + s + '\"' +
                    '}';
        }
    }
}
