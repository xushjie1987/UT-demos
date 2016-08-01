/**
 * Project Name:demo5
 * File Name:TestRunner.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午3:00:32
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * ClassName:TestRunner <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午3:00:32 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
@RunWith(MockitoJUnitRunner.class)
public class TestRunner {
    
    @Mock
    private ClassB b;
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @Test
    public void test01() {
        //
        System.out.println(b.fun1());
        
        //
        verify(b).fun1();
    }
    
}
