/**
 * Project Name:demo2
 * File Name:TestMock.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日上午11:49:27
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * ClassName:TestMock <br/>
 * Function: <br/>
 * Date: 2016年8月1日 上午11:49:27 <br/>
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
    @SuppressWarnings("rawtypes")
    @Test(expected = RuntimeException.class)
    public void test01() {
        // You can mock concrete classes, not just interfaces
        LinkedList mockedList = Mockito.mock(LinkedList.class);
        
        // stubbing
        Mockito.when(mockedList.get(0))
               .thenReturn("first");
        Mockito.when(mockedList.get(1))
               .thenThrow(new RuntimeException());
        
        // following prints "first"
        System.out.println(mockedList.get(0));
        
        // following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));
        
        // Although it is possible to verify a stubbed invocation, usually it's just redundant
        // If your code cares what get(0) returns, then something else breaks (often even before
        // verify() gets executed).
        // If your code doesn't care what get(0) returns, then it should not be stubbed. Not
        // convinced? See here.
        Mockito.verify(mockedList,
                       Mockito.times(1))
               .get(0);
        
        // following throws runtime exception
        System.out.println(mockedList.get(1));
    }
    
    /**
     * test02: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @Test
    public void test02() {
        //
        AbstractA a = mock(AbstractA.class);
        
        //
        when(a.fun1()).thenReturn("hello");
        when(a.fun2()).thenReturn(99);
        
        //
        System.out.println(a.fun1());
        System.out.println(a.fun2());
        
        //
        verify(a).fun1();
        verify(a).fun2();
    }
    
}
