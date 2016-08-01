/**
 * Project Name:demo5
 * File Name:TestAnnotation.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午2:47:38
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.MockitoAnnotations;

/**
 * ClassName:TestAnnotation <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午2:47:38 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestMock {
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @Test
    public void test01() {
        //
        ClassA a = new ClassA();
        
        //
        MockitoAnnotations.initMocks(a);
        
        //
        System.out.println(a.fun1());
        
        //
        verify(a.getB()).fun1();
    }
    
}
