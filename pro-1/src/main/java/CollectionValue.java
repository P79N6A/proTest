import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionValue {
    public static void main(String[] args){
        String ss="";
        System.out.println(ss.length());


        List list =new ArrayList();
        Integer a=9099999;
        for (int i = 0; i < 2; i++) {
            list.add(a);
            a=1200000;
        }
        System.out.println(list);

        System.out.println("----");

        List<A> l=new ArrayList();
        A zz= new A();
        A zz1 = new A();
        l.add(zz);
        zz1.a=3;
        zz=zz1;
        l.add(zz);

        System.out.println("将其放入map中时");
        Map<String,A> map = new HashMap();
        A aa=new A();
        map.put("1",aa);
        A aa1 = new A();
        aa1.a=1111;
        aa=aa1;
        map.put("2",aa);
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));

        System.out.println(l);
        System.out.println(l.get(0).a);
        System.out.println(l.get(1).a);

        System.out.println("-----");

        String s = "123";
        List l2=new ArrayList();
        for (int i = 0; i < 2; i++) {
            l2.add(s);
            s="345";
        }
        System.out.println(l2);

        String s1= new String("AAss");
        //StringBuffer s1= new StringBuffer("0000");
        //StringBuffer s11 = new StringBuffer("1111");
        List l3=new ArrayList();
        for (int i = 0; i < 2; i++) {
            l3.add(s1);
        }
        System.out.println(l3);
    }
    public static class A{
        int a=1;

        @Override
        public String toString() {
            return String.valueOf(a);
        }
    }
}
