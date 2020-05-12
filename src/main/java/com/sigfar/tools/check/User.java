package com.sigfar.tools.check;

public class User {

    private static Address NO_ADDR=new Address() {
        @Override
        public void getAddr() {
            System.out.println("没地方住");
        }
    };

    public void getName(){
        System.out.println("sigfar");
    }

    public Address getAddr(){
        Address address=null;
        if(address==null){
            return NO_ADDR;
        }else {
            return address;
        }
    }

}
