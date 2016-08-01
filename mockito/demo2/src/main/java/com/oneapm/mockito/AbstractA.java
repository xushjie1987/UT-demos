/**
 * Project Name:demo2
 * File Name:AbstractA.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午3:39:07
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import java.security.SecureRandom;

/**
 * ClassName:AbstractA <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午3:39:07 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public abstract class AbstractA {
    
    public abstract String fun1();
    
    public int fun2() {
        return new SecureRandom().nextInt();
    }
    
}
