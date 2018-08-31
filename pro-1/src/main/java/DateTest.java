import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //测试java.util.date

        //1.将Date类型转化成对应格式的字符串
        //SimpleDateFormat始终都要创建的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date =new Date();
        String oldDate = sdf.format(date);
        System.out.println(oldDate);

        //2.将字符串转化成指定格式的时间
        //SimpleDateFormat始终都要创建的
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH_mm_ss");
        try {
            Date date2= sdf2.parse("2018-11-11 11_22_33");
            System.out.println(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //getTime
        Date d1=new Date();
        Date d2=new Date(d1.getTime()+3000);
        Date d3=new Date(3000);
        System.out.println(d1);
        System.out.println(d2);//延迟3秒
    }
}
