/**
 * Project Name:demo5
 * File Name:InjectC.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午3:19:32
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import lombok.Getter;

/**
 * ClassName:InjectC <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午3:19:32 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class InjectC {
    
    @Getter
    private InjectD d;
    
    public int fun1() {
        return d.fun1();
    }
}
