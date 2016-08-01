/**
 * Project Name:demo5
 * File Name:SpyA.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午4:26:44
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

/**
 * ClassName:SpyA <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午4:26:44 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class SpyA {
    
    public SpyA() {
        System.out.println("SpyA() is called");
    }
    
    public SpyA(String publicConstructorWithOneArg) {
        System.out.println("SpyA(String publicConstructorWithOneArg) is called");
    }
    
    public int fun1() {
        return 100;
    }
    
}
