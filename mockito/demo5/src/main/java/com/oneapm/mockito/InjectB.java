/**
 * Project Name:demo5
 * File Name:InjectB.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午3:19:24
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import lombok.Getter;

/**
 * ClassName:InjectB <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午3:19:24 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class InjectB {
    
    @Getter
    private InjectC c;
    
    public InjectB(InjectC c) {
        this.c = c;
    }
    
    public void setC(InjectC c) {
        this.c = c;
    }
    
    public int fun1() {
        return c.fun1();
    }
    
}
