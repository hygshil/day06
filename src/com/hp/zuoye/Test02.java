package com.hp.zuoye;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 *
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String hello="大家好！";
        StringBuilder s = new StringBuilder(hello);
        s.append("我是程序员！");
        System.out.println(s);
        s.insert(6,"优秀的");
        System.out.println(s);
        s.replace(6,8,"牛牛");
        System.out.println(s);
        s.delete(0,4);
        System.out.println(s);
    }
}
