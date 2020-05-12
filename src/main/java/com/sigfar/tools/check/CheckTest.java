package com.sigfar.tools.check;

import org.springframework.util.Assert;

public class CheckTest {

    public static void main(String[] args) {
        User user=new User();
//        User user=null;
        Assert.notNull(user,"user不能为空");
        user.getName();
        user.getAddr().getAddr();
    }
}
