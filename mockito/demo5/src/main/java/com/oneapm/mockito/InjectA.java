/**
 * Project Name:demo5
 * File Name:InjectA.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午3:19:17
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import lombok.Getter;

import org.mockito.InjectMocks;
import org.mockito.Mock;

/**
 * ClassName:InjectA <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午3:19:17 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class InjectA {
    
    @Mock(name = "c")
    private InjectC c;
    
    @Mock
    private InjectC c1;
    
    @Getter
    @InjectMocks
    private InjectB b;
    
    public int fun1() {
        return b.fun1();
    }
    
}
