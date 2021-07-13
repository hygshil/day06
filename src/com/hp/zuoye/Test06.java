package com.hp.zuoye;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 *
 *
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个算式:");
        String str = scanner.nextLine();
        if (str.contains("+")) {   //contains()判断该字符串中是否含有子字符串
            String[] num = str.split("\\+");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);
            System.out.println("运算结果是:" + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (str.contains("-")) {
            String[] num = str.split("\\-");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);
            System.out.println("运算结果是：" + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (str.contains("*")) {
            String[] num = str.split("\\*");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);
            System.out.println("运算结果是：" + num1 + "*" + num2 + "=" + (num1 * num2));
        } else {
            String[] num = str.split("\\/");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);
            System.out.println("运算结果是：" + num1 + "/" + num2 + "=" + (num1 / num2));
        }

    }
    public static int parseInt(String str){
        //最后要生成的数字
        int num = 0;
        //临时变量，用于计算对应位数的数字
        int flag = 0;
        for(int i=0;i<str.length();i++){
            flag = (str.charAt(i)-48);
            /*
             * 这里是将对应的数字计算为对应的位，例如百位数字就要用该数字乘以10的2次方
             * 得到
             * 可以用Math的相关方法处理(自行查看API文档)
             */
            for(int n=0;n<str.length()-1-i;n++){
                flag*=10;
            }
            num+=flag;
        }
        return num;
    }
}
