/**
 * Project Name:sample1
 * File Name:StaticA.java
 * Package Name:com.oneapm.powermock
 * Date:2016年8月1日下午7:14:37
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.powermock;

/**
 * ClassName:StaticA <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午7:14:37 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class StaticA {
    
    public static int fun1() {
        System.out.println("StaticA::fun1()");
        return 10;
    }
    
    public static int fun2(String val) {
        System.out.println("StaticA::fun2()");
        return 10;
    }
    
    public static void fun3(String val) {
        System.out.println("StaticA::fun3()");
    }
    
}
