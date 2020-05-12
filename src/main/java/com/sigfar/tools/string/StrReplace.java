package com.sigfar.tools.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author heyj
 * @Date 2020/4/2
 */
public class StrReplace {

    public static void main(String[] args) {
        replaceStringP("123Stage456","stage","PPAP");
    }


    public static void replaceStringP(String source, String oldstring, String newstring){

        Matcher m = Pattern.compile(oldstring, Pattern.CASE_INSENSITIVE).matcher(source);

        String result=m.replaceAll(newstring);

        System.out.println("使用正则表达式不区分大小写的替换结果"+result);



        Matcher m1 = Pattern.compile(oldstring, Pattern.CANON_EQ).matcher(source);

        String result1=m1.replaceAll(newstring);

        System.out.println("使用正则表达式区分大小写的替换结果"+result1);

    }
}
