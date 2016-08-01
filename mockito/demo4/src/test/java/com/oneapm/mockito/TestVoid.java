/**
 * Project Name:demo4
 * File Name:TestVoid.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午2:35:41
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * ClassName:TestVoid <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午2:35:41 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestVoid {
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings("rawtypes")
    @Test
    public void test01() {
        // mock creation
        List mockedList = Mockito.mock(List.class);
        
        // function return void
        doNothing().when(mockedList)
                   .clear();
        
        //
        mockedList.clear();
        
        //
        verify(mockedList).clear();
        
    }
    
    /**
     * test02: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings("rawtypes")
    @Test(expected = RuntimeException.class)
    public void test02() {
        // mock creation
        List mockedList = Mockito.mock(List.class);
        
        // function return void
        doThrow(RuntimeException.class).when(mockedList)
                                       .clear();
        
        //
        mockedList.clear();
        System.out.println("hello test02");
        
        //
        verify(mockedList).clear();
        
    }
    
}
