/**
 * Project Name:demo3
 * File Name:TestMatcher.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午1:45:58
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;

import org.junit.Test;

/**
 * ClassName:TestMatcher <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午1:45:58 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestMatcher {
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings("rawtypes")
    @Test
    public void test01() {
        // You can mock concrete classes, not just interfaces
        LinkedList mockedList = mock(LinkedList.class);
        
        // stubbing using built-in anyInt() argument matcher
        when(mockedList.get(anyInt())).thenReturn("element");
        
        // following prints "element"
        System.out.println(mockedList.get(anyInt()));
        
        // you can also verify using an argument matcher
        verify(mockedList).get(anyInt());
    }
    
    /**
     * test02: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @Test
    public void test02() {
        // You can mock concrete classes, not just interfaces
        ClassA mockedList = mock(ClassA.class);
        
        // correct - eq() is also an argument matcher
        // Matcher methods like anyObject(), eq() do not return matchers. Internally, they record a
        // matcher on a stack and return a dummy value (usually null). This implementation is due to
        // static type safety imposed by the java compiler. The consequence is that you cannot use
        // anyObject(), eq() methods outside of verified/stubbed method.
        when(mockedList.fun1(anyString(),
                             anyInt(),
                             eq("test02"))).thenReturn(1);
        
        // By default, for all methods that return a value, a mock will return either null, a a
        // primitive/primitive wrapper value, or an empty collection, as appropriate. For example 0
        // for an int/Integer and false for a boolean/Boolean.
        System.out.println(mockedList.fun1("hello",
                                           22,
                                           "failed"));
        System.out.println(mockedList.fun1("hello",
                                           22,
                                           "test02"));
        
        //
        verify(mockedList).fun1(anyString(),
                                anyInt(),
                                eq("test02"));
        
    }
    
    //@formatter:off
    /**
     * test03: <br/>
     * 
        org.mockito.exceptions.misusing.InvalidUseOfMatchersException: 
        Invalid use of argument matchers!
        3 matchers expected, 2 recorded:
        -> at com.oneapm.mockito.TestMatcher.test03(TestMatcher.java:100)
        -> at com.oneapm.mockito.TestMatcher.test03(TestMatcher.java:101)
        
        This exception may occur if matchers are combined with raw values:
            //incorrect:
            someMethod(anyObject(), "raw String");
        When using matchers, all arguments have to be provided by matchers.
        For example:
            //correct:
            someMethod(anyObject(), eq("String by matcher"));
        
        For more info see javadoc for Matchers class.
        
            at com.oneapm.mockito.TestMatcher.test03(TestMatcher.java:100)
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
    public void test03() {
        // You can mock concrete classes, not just interfaces
        ClassA mockedList = mock(ClassA.class);
        
        // incorrect - exception will be thrown because third argument is given without an argument
        // matcher.
        when(mockedList.fun1(anyString(),
                             anyInt(),
                             "test02")).thenReturn(1);
        
    }
}
