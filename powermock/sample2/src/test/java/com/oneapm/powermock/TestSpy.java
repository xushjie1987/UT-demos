/**
 * Project Name:sample2
 * File Name:TestSpy.java
 * Package Name:com.oneapm.powermock
 * Date:2016年8月2日上午10:42:11
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.powermock;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * ClassName:TestSpy <br/>
 * Function: <br/>
 * Date: 2016年8月2日 上午10:42:11 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(LinkedList.class)
public class TestSpy {
    
    /**
     * test01: <br/>
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings("rawtypes")
    @Test
    public void test01() {
        List list = new LinkedList();
        List spy = PowerMockito.spy(list);
        // Impossible: real method is called so spy.get(0) throws IndexOutOfBoundsException (the
        // list is yet empty)
        // PowerMockito.when(spy.get(0)).thenReturn("foo");
        
        // You have to use doReturn() for stubbing
        PowerMockito.doReturn("foo")
                    .when(spy)
                    .get(0);
        //
        System.out.println(spy.get(0));
        // verify
        Mockito.verify(spy)
               .get(0);
    }
    
}
