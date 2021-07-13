package com.hp.zuoye;

import java.util.Scanner;

// 作业: 写一个 private 方法, 需要 传一个 string 的 网址参数, 返回 处理后的数据.
// 假定 大数据获取了 很多网址, 我想要 www -----  com 之间的内容
// 有一下  几类网址
// www.oracle.com  ---->  oracle
// www.oracle.com.cn  ---->  oracle
// www.java.oracle.com.cn  ---->  java.oracle
// www.lol.game.qq.com.cn  ---->  lol.game.qq
// www.game.mycom.com.cn  ---->  game.mycom
// www.girl.mycom.com.cn  ---->  girl.mycom
// www.computer.mycom.com.cn  ---->  computer.mycom
public class Test07 {
    public static void main(String[] args) {
        System.out.println("请输入你的网址：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String a=".com";
        String email = str.substring(4,str.indexOf(a));
        System.out.println(email);
    }

}
