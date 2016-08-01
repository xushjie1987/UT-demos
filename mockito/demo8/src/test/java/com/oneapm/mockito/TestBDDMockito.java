/**
 * Project Name:demo8
 * File Name:TestBDDMockito.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午5:57:56
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

import java.util.List;

import org.junit.Test;

/**
 * ClassName:TestBDDMockito <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午5:57:56 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestBDDMockito {
    
    /**
     * test01: <br/>
     * @author xushjie
     * @since JDK 1.7
     */
    @Test
    public void test01() {
        // mock
        BDDMockitoA a = mock(BDDMockitoA.class);
        // given
        given(a.fun1("null")).willReturn(-1);
        
        // when
        int result = a.fun1("null");
        
        // then
        assertThat(-1,
                   equalTo(result));
    }
    
    /**
     * test02: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @Test(expected = RuntimeException.class)
    public void test02() {
        // mock
        BDDMockitoA a = mock(BDDMockitoA.class);
        // given
        willThrow(new RuntimeException()).given(a)
                                         .fun2();
        // when
        a.fun2();
    }
    
    /**
     * test03: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test03() {
        
        // mock
        List mock = mock(List.class);
        // given
        
        // when
        mock.add("a");
        mock.add("b");
        
        // then
        then(mock).should(times(2))
                  .add(anyString());
        
    }
    
}
