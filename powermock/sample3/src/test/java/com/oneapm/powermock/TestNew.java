/**
 * Project Name:sample3
 * File Name:TestNew.java
 * Package Name:com.oneapm.powermock
 * Date:2016年8月2日上午11:07:21
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.powermock;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * ClassName:TestNew <br/>
 * Function: <br/>
 * Date: 2016年8月2日 上午11:07:21 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(TestedA.class)
public class TestNew {
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @throws Exception
     * @since JDK 1.7
     */
    @Test
    public void test01() throws Exception {
        //
        NewA a = new NewA();
        a.setVal("world");
        PowerMockito.whenNew(NewA.class)
                    .withNoArguments()
                    .thenReturn(a);
        //
        TestedA t = new TestedA();
        //
        t.fun1();
        //
        PowerMockito.verifyNew(NewA.class)
                    .withNoArguments();
    }
    
    /**
     * test02: <br/>
     * success
     * @author xushjie
     * @throws Exception
     * @since JDK 1.7
     */
    @SuppressWarnings("rawtypes")
    @Test
    public void test02() throws Exception {
        //
        ArrayList f = PowerMockito.mock(ArrayList.class);
        PowerMockito.when(f.size())
                    .thenReturn(1000000);
        //
        PowerMockito.whenNew(ArrayList.class)
                    .withNoArguments()
                    .thenReturn(f);
        //
        TestedA t = new TestedA();
        //
        t.fun2();
        //
        PowerMockito.verifyNew(ArrayList.class)
                    .withNoArguments();
    }
    
}
