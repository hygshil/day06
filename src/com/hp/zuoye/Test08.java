package com.hp.zuoye;

// 练习:  { "username":"tangseng", "age":"500"  }  提取json 中的  k 和  v .. 赋值到一个对象
// QuJingRen 类-----> username ,  age
public class Test08 {
    public static void main(String[] args) {
        String a="{'username':'唐僧','age':'500'}";
        String b="{'username':'孙悟空','age':'500'}";
        String c="{'username':'猪八戒','age':'500'}";
        String d="{'username':'悟净','age':'500'}";

            String[] split = d.split("\\,");
            for (String s1 : split) {
                System.out.println("s1 = " + s1);
        }
    }

}
