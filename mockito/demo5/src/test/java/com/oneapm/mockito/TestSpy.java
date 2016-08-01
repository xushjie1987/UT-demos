/**
 * Project Name:demo5
 * File Name:TestSpy.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午4:26:06
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

/**
 * ClassName:TestSpy <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午4:26:06 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestSpy {
    
    // Instance for spying is created by calling constructor explicitly:
    @Spy
    SpyA spyOnFoo = new SpyA("argument");
    
    // Instance for spying is created by mockito via reflection (only default constructors
    // supported):
    @Spy
    SpyA spyOnBar;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @Test
    public void test01() {
        //
        when(spyOnFoo.fun1()).thenReturn(9999);
        doReturn(1024).when(spyOnBar)
                      .fun1();
        
        //
        System.out.println(spyOnFoo.fun1());
        System.out.println(spyOnBar.fun1());
    }
    
}
