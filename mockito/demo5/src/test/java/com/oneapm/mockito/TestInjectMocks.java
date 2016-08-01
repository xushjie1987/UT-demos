/**
 * Project Name:demo5
 * File Name:TestInjectMocks.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午3:19:03
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.MockitoAnnotations;

/**
 * ClassName:TestInjectMocks <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午3:19:03 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestInjectMocks {
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @Test
    public void test01() {
        //
        InjectA a = new InjectA();
        
        //
        MockitoAnnotations.initMocks(a);
        
        //
        System.out.println(a.fun1());
    }
    
    //@formatter:off
    /**
     * test02: <br/>
     * 
        org.mockito.exceptions.base.MockitoException: 
        Cannot instantiate @InjectMocks field named 'f'.
        You haven't provided the instance at field declaration so I tried to construct the instance.
        However, I failed because: the type 'InjectF is an abstract class.
        Examples of correct usage of @InjectMocks:
           @InjectMocks Service service = new Service();
           @InjectMocks Service service;
           //also, don't forget about MockitoAnnotations.initMocks();
           //and... don't forget about some @Mocks for injection :)
        
            at com.oneapm.mockito.TestInjectMocks.test02(TestInjectMocks.java:57)
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
        Caused by: org.mockito.exceptions.base.MockitoException: the type 'InjectF is an abstract class.
            ... 24 more
     * @author xushjie
     * @since JDK 1.7
     */
    //@formatter:on
    @Test
    public void test02() {
        //
        AbstractA a = mock(AbstractA.class);
        
        //
        MockitoAnnotations.initMocks(a);
        
        //
        System.out.println(a.fun1());// ok
        System.out.println(a.fun2());// ok
        System.out.println(a.fun3());// exception
        System.out.println(a.fun4());// exception
        
    }
    
}
