/**
 * Project Name:demo7
 * File Name:TestArgumentCaptor.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午5:21:45
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

/**
 * ClassName:TestArgumentCaptor <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午5:21:45 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestArgumentCaptor {
    
    /**
     * test01: <br/>
     * success <br>
     * 在某些场景中，不光要对方法的返回值和调用进行验证， 同时需要验证一系列交互后所传入方法的参数。 那么我们可以用参数捕获器来捕获传入方法的参数进行验证，看它是否符合我们的要求。
     * 通过ArgumentCaptor对象的forClass(Class<T>
     * clazz)方法来构建ArgumentCaptor对象。然后便可在验证时对方法的参数进行捕获，最后验证捕获的参数值
     * 。如果方法有多个参数都要捕获验证，那就需要创建多个ArgumentCaptor对象处理。
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Test
    public void test01() {
        List mock = mock(List.class);
        List mock2 = mock(List.class);
        mock.add("John");
        mock2.add("Brian");
        mock2.add("Jim");
        //
        ArgumentCaptor argument = ArgumentCaptor.forClass(String.class);
        
        //
        verify(mock).add(argument.capture());
        //
        assertEquals("John",
                     argument.getValue());
        
        //
        verify(mock2,
               times(2)).add(argument.capture());
        //
        assertEquals("Jim",
                     argument.getValue());
        assertArrayEquals(new Object[] { "John", "Brian", "Jim" },
                          argument.getAllValues()
                                  .toArray());
    }
    
}
