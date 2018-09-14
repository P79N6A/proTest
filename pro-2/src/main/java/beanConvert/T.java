package beanConvert;

import org.springframework.beans.BeanUtils;

public class T {
    public static void main(String[] args) {
        Bean1 b1 = new Bean1();
        b1.f1 = false;
        b1.a=1;
        b1.b=2;
        b1.s="sss";
        b1.isAA=false;

        /**
         * 一定要加上getter setter方法才行
         * 注意：is开头的变量，要手动调整setter方法
         */

        Bean2 b2 = new Bean2();
        BeanUtils.copyProperties(b1,b2);
        System.out.println(b1);
        System.out.println(b2);
    }
}
