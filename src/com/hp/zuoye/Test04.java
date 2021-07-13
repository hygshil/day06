package com.hp.zuoye;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 *
 *
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println("请输入你的email地址：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String email = str.substring(0,str.indexOf("@"));
        System.out.println(email);
    }
}
