package com.sigfar.tools.string;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringCode {

    public static void main(String[] args) throws Exception{
        byte[] b1 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
        byte[] b2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
        byte[] b3 = "Hello".getBytes("GBK"); // 按GBK编码转换
        byte[] b4 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换

        for (int i = 0; i <b1.length ; i++) {
            System.out.print(b1[i]);
        }
        System.out.println("======");

        for (int i = 0; i <b2.length ; i++) {
            System.out.print(b2[i]);
        }
        System.out.println("======");


        for (int i = 0; i <b3.length ; i++) {
            System.out.print(b1[3]);
        }
        System.out.println("======");


        for (int i = 0; i <b4.length ; i++) {
            System.out.print(b4[i]);
        }
        System.out.println("======");
    }
}
