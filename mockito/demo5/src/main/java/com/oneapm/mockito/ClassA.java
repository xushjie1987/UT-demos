/**
 * Project Name:demo5
 * File Name:ClassA.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午2:47:59
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import org.mockito.Mock;

/**
 * ClassName:ClassA <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午2:47:59 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class ClassA {
    
    @Mock
    private ClassB b;
    
    public int fun1() {
        return b.fun1();
    }
    
    public ClassB getB() {
        return b;
    }
    
    public void setB(ClassB b) {
        this.b = b;
    }
    
}
