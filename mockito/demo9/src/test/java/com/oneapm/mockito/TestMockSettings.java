/**
 * Project Name:demo9
 * File Name:TestMockSettings.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午6:29:54
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.RETURNS_SMART_NULLS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;

import java.util.List;

import org.junit.Test;

/**
 * ClassName:TestMockSettings <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午6:29:54 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestMockSettings {
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings("rawtypes")
    @Test
    public void test01() {
        List mock = mock(List.class,
                         withSettings().name("new mock name")
                                       .defaultAnswer(RETURNS_SMART_NULLS)
                                       .extraInterfaces(InterfaceA.class));
        InterfaceA mocka = (InterfaceA) mock;
        //
        when(mocka.a1(anyString())).thenReturn(10000);
        when(mock.size()).thenReturn(9000);
        
        //
        System.out.println(mock.size());
        System.out.println(mocka.a1("hello"));
    }
    
}
