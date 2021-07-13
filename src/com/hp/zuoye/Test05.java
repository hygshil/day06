package com.hp.zuoye;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 *
 */
public class Test05 {
    public static void main(String[] args) {
        String s1 = random();
        System.out.println(s1);
        System.out.println("请输入验证码：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(s1.equalsIgnoreCase(str)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
 public static String random() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (random.nextInt(2) == 1) {
                builder.append((char) ('a' + random.nextInt(27)));
            } else {
                builder.append((char) ('A' + random.nextInt(27)));
            }
        }
        return builder.toString();
    }
}
