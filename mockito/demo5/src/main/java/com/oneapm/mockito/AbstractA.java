/**
 * Project Name:demo5
 * File Name:AbstractA.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午3:50:42
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import org.mockito.InjectMocks;
import org.mockito.Mock;

/**
 * ClassName:AbstractA <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午3:50:42 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public abstract class AbstractA {
    
    @Mock
    private InjectE e;
    
    @InjectMocks
    private InjectF f;
    
    public int fun1() {
        return e.fun1();
    }
    
    public int fun3() {
        return f.fun1();
    }
    
    public int fun4() {
        return f.fun2();
    }
    
    public abstract double fun2();
    
}
