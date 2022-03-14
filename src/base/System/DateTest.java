package base.System;

import java.util.Date;
/**
 * @Author: Billyme
 * @Date: 2022/3/13 上午 10:57
 * @Describe:
 */

public class DateTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date data = new Date();
        System.out.println(data.toString());
        System.out.println(data.getTime());

    }

}
