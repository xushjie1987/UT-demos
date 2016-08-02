/**
 * Project Name:sample4
 * File Name:PrivateA.java
 * Package Name:com.oneapm.powermock
 * Date:2016年8月2日上午11:26:13
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.powermock;

/**
 * ClassName:PrivateA <br/>
 * Function: <br/>
 * Date: 2016年8月2日 上午11:26:13 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class PrivateA {
    
    public void fun1() {
        System.out.println(fun3());
    }
    
    public static void fun2() {
        System.out.println(fun4());
    }
    
    private int fun3() {
        return 333;
    }
    
    private static int fun4() {
        return 444;
    }
    
}
