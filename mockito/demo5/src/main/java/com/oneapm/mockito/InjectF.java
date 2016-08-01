/**
 * Project Name:demo5
 * File Name:InjectF.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午3:56:27
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import lombok.Setter;

/**
 * ClassName:InjectF <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午3:56:27 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public abstract class InjectF {
    
    @Setter
    private InjectE e;
    
    public int fun2() {
        return e.fun1();
    }
    
    public abstract int fun1();
    
    public InjectF(InjectE e) {
        this.e = e;
    }
    
}
