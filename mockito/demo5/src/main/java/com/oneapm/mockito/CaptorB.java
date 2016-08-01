/**
 * Project Name:demo5
 * File Name:CaptorB.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午5:33:52
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import lombok.Getter;

import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;

/**
 * ClassName:CaptorB <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午5:33:52 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class CaptorB {
    
    @Getter
    @Captor
    private ArgumentCaptor<CaptorA> captor;
    
    @Getter
    @Mock
    private CaptorB                 b;
    
    public void fun1(CaptorA a) {
        a.setArgVal("new");
    }
    
}
