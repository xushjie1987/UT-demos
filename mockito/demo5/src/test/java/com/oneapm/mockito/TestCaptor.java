/**
 * Project Name:demo5
 * File Name:TestCaptor.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午5:32:32
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.MockitoAnnotations;

/**
 * ClassName:TestCaptor <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午5:32:32 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestCaptor {
    
    //@formatter:off
    /**
     * test01: <br/>
        org.junit.ComparisonFailure: expected:<[new]> but was:<[old]>
            at org.junit.Assert.assertEquals(Assert.java:115)
            at org.junit.Assert.assertEquals(Assert.java:144)
            at com.oneapm.mockito.TestCaptor.test01(TestCaptor.java:45)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:497)
            at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
            at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
            at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
            at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
            at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
            at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
            at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
            at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
            at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
            at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
            at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
            at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
            at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
            at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)
            at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
            at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)
            at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)
            at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)
            at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)
     * @author xushjie
     * @since JDK 1.7
     */
    //@formatter:on
    @Test
    public void test01() {
        CaptorB b = new CaptorB();
        //
        MockitoAnnotations.initMocks(b);
        //
        b.getB()
         .fun1(new CaptorA("old"));
        //
        verify(b.getB()).fun1(b.getCaptor()
                               .capture());
        assertEquals("new",
                     b.getCaptor()
                      .getValue()
                      .getArgVal());
    }
    
    /**
     * test02: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @Test
    public void test02() {
        CaptorB b = new CaptorB();
        //
        MockitoAnnotations.initMocks(b);
        //
        b.getB()
         .fun1(new CaptorA("old"));
        //
        verify(b.getB()).fun1(b.getCaptor()
                               .capture());
        assertEquals("old",
                     b.getCaptor()
                      .getValue()
                      .getArgVal());
    }
    
}
