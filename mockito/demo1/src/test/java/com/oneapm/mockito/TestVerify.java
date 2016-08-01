/**
 * Project Name:demo1
 * File Name:TestVerify.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日上午11:20:50
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * ClassName:TestVerify <br/>
 * Function: <br/>
 * Date: 2016年8月1日 上午11:20:50 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestVerify {
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test01() {
        // mock creation
        List mockedList = Mockito.mock(List.class);
        
        // using mock object
        mockedList.add("one");
        mockedList.clear();
        
        // verification
        Mockito.verify(mockedList)
               .add("one");
        Mockito.verify(mockedList)
               .clear();
        
    }
    
    //@formatter:off
    /**
     * test02: <br/>
        org.mockito.exceptions.verification.TooLittleActualInvocations: 
        list.add("one");
        Wanted 2 times:
        -> at com.oneapm.mockito.TestVerify.test02(TestVerify.java:64)
        But was 1 time:
        -> at com.oneapm.mockito.TestVerify.test02(TestVerify.java:58)
            at com.oneapm.mockito.TestVerify.test02(TestVerify.java:64)
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
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test02() {
        // mock creation
        List mockedList = Mockito.mock(List.class);
        
        // using mock object
        mockedList.add("one");
        
        // verification
        Mockito.verify(mockedList,
                       Mockito.times(2))
               .add("one");
        
    }
    
    //@formatter:off
    /**
     * test03: <br/>
     * 
        Argument(s) are different! Wanted:
        list.add("two");
        -> at com.oneapm.mockito.TestVerify.test03(TestVerify.java:121)
        Actual invocation has different arguments:
        list.add("one");
        -> at com.oneapm.mockito.TestVerify.test03(TestVerify.java:116)
            at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
            at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
            at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
            at java.lang.reflect.Constructor.newInstance(Constructor.java:422)
            at com.oneapm.mockito.TestVerify.test03(TestVerify.java:121)
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
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test03() {
        // mock creation
        List mockedList = Mockito.mock(List.class);
        
        // using mock object
        mockedList.add("one");
        
        // verification
        Mockito.verify(mockedList,
                       Mockito.times(1))
               .add("two");
        
    }
    
    /**
     * test04: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test04() {
        // mock creation
        List mockedList = Mockito.mock(List.class);
        
        // using mock object
        mockedList.add("one");
        
        // verification
        Mockito.verify(mockedList,
                       Mockito.times(1));
        
    }
    
    /**
     * test05: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test05() {
        // mock creation
        List mockedList = Mockito.mock(List.class);
        
        // using mock object
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("two");
        
        // verification
        Mockito.verify(mockedList,
                       Mockito.times(1))
               .add("one");
        Mockito.verify(mockedList,
                       Mockito.times(1))
               .add("one");
        Mockito.verify(mockedList,
                       Mockito.times(2))
               .add("two");
        
    }
    
}
