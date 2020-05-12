package com.sigfar.tools.reflection.field;


import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class FieldTest {

        public static void main(String[] args) throws Exception {
            BeanInfo info = Introspector.getBeanInfo(User.class);
            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                System.out.println(pd.getName());
                System.out.println("  " + pd.getReadMethod());
                System.out.println("  " + pd.getWriteMethod());
            }
        }

}
