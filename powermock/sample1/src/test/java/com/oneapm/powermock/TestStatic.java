/**
 * Project Name:sample1
 * File Name:TestStatic.java
 * Package Name:com.oneapm.powermock
 * Date:2016年8月1日下午7:15:42
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.powermock;

import java.lang.reflect.InvocationTargetException;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * ClassName:TestStatic <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午7:15:42 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticA.class)
public class TestStatic {
    
    /**
     * test01: <br/>
     * success
     * @author xushjie
     * @since JDK 1.7
     */
    @Test
    public void test01() {
        //
        PowerMockito.mockStatic(StaticA.class);
        //
        Mockito.when(StaticA.fun1())
               .thenReturn(99);
        TestedA a = new TestedA();
        int result = a.fun1();
        //
        PowerMockito.verifyStatic();
        StaticA.fun1();
        //
        MatcherAssert.assertThat(99,
                                 CoreMatchers.equalTo(result));
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
        PowerMockito.mockStatic(StaticA.class);
        //
        Mockito.when(StaticA.fun2(Mockito.anyString()))
               .thenReturn(99);
        //
        int result = StaticA.fun2(Mockito.anyString());
        //
        PowerMockito.verifyStatic();
        StaticA.fun2(Mockito.anyString());
        //
        MatcherAssert.assertThat(99,
                                 CoreMatchers.equalTo(result));
    }
    
    /**
     * test03: <br/>
     * success
     * @author xushjie
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws SecurityException
     * @since JDK 1.7
     */
    @Test
    public void test03() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        //
        PowerMockito.mockStatic(StaticA.class);
        //
        PowerMockito.doNothing()
                    .when(StaticA.class);
        //
        StaticA.fun3("hello");
    }
    
    //@formatter:off
    /**
     * test04: <br/>
        org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at com.oneapm.powermock.TestStatic.test04(TestStatic.java:118)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, you naughty developer!
         3: you are stubbing the behaviour of another mock inside before 'thenReturn' instruction if completed
        
            at org.powermock.core.MockGateway.doMethodCall(MockGateway.java:132)
            at org.powermock.core.MockGateway.methodCall(MockGateway.java:63)
            at com.oneapm.powermock.StaticA.fun3(StaticA.java)
            at com.oneapm.powermock.TestStatic.test04(TestStatic.java:121)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:497)
            at org.junit.internal.runners.TestMethod.invoke(TestMethod.java:68)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit44RunnerDelegateImpl$PowerMockJUnit44MethodRunner.runTestMethod(PowerMockJUnit44RunnerDelegateImpl.java:316)
            at org.junit.internal.runners.MethodRoadie$2.run(MethodRoadie.java:88)
            at org.junit.internal.runners.MethodRoadie.runBeforesThenTestThenAfters(MethodRoadie.java:96)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit44RunnerDelegateImpl$PowerMockJUnit44MethodRunner.executeTest(PowerMockJUnit44RunnerDelegateImpl.java:300)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit47RunnerDelegateImpl$PowerMockJUnit47MethodRunner.executeTestInSuper(PowerMockJUnit47RunnerDelegateImpl.java:131)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit47RunnerDelegateImpl$PowerMockJUnit47MethodRunner.access$100(PowerMockJUnit47RunnerDelegateImpl.java:59)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit47RunnerDelegateImpl$PowerMockJUnit47MethodRunner$TestExecutorStatement.evaluate(PowerMockJUnit47RunnerDelegateImpl.java:147)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit47RunnerDelegateImpl$PowerMockJUnit47MethodRunner.evaluateStatement(PowerMockJUnit47RunnerDelegateImpl.java:107)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit47RunnerDelegateImpl$PowerMockJUnit47MethodRunner.executeTest(PowerMockJUnit47RunnerDelegateImpl.java:82)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit44RunnerDelegateImpl$PowerMockJUnit44MethodRunner.runBeforesThenTestThenAfters(PowerMockJUnit44RunnerDelegateImpl.java:288)
            at org.junit.internal.runners.MethodRoadie.runTest(MethodRoadie.java:86)
            at org.junit.internal.runners.MethodRoadie.run(MethodRoadie.java:49)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit44RunnerDelegateImpl.invokeTestMethod(PowerMockJUnit44RunnerDelegateImpl.java:208)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit44RunnerDelegateImpl.runMethods(PowerMockJUnit44RunnerDelegateImpl.java:147)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit44RunnerDelegateImpl$1.run(PowerMockJUnit44RunnerDelegateImpl.java:121)
            at org.junit.internal.runners.ClassRoadie.runUnprotected(ClassRoadie.java:33)
            at org.junit.internal.runners.ClassRoadie.runProtected(ClassRoadie.java:45)
            at org.powermock.modules.junit4.internal.impl.PowerMockJUnit44RunnerDelegateImpl.run(PowerMockJUnit44RunnerDelegateImpl.java:123)
            at org.powermock.modules.junit4.common.internal.impl.JUnit4TestSuiteChunkerImpl.run(JUnit4TestSuiteChunkerImpl.java:121)
            at org.powermock.modules.junit4.common.internal.impl.AbstractCommonPowerMockRunner.run(AbstractCommonPowerMockRunner.java:53)
            at org.powermock.modules.junit4.PowerMockRunner.run(PowerMockRunner.java:59)
            at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)
            at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
            at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)
            at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)
            at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)
            at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)
     * @author xushjie
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws SecurityException
     * @since JDK 1.7
     */
    //@formatter:on
    @Test
    public void test04() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        //
        PowerMockito.mockStatic(StaticA.class);
        //
        Mockito.doNothing()
               .when(StaticA.class);
        //
        StaticA.fun3("hello");
    }
    
    /**
     * test05: <br/>
     * success
     * @author xushjie
     * @throws Exception
     * @since JDK 1.7
     */
    @Test
    public void test05() throws Exception {
        //
        PowerMockito.mockStatic(StaticA.class);
        //
        PowerMockito.doNothing()
                    .when(StaticA.class,
                          "fun3",
                          Mockito.anyString());
        //
        StaticA.fun3("hello");
        //
        PowerMockito.verifyStatic();
        //
        StaticA.fun3("hello");
    }
    
    /**
     * test06: <br/>
     * success
     * @author xushjie
     * @throws Exception
     * @since JDK 1.7
     */
    @Test
    public void test06() throws Exception {
        //
        PowerMockito.mockStatic(StaticA.class);
        //
        PowerMockito.doNothing()
                    .when(StaticA.class,
                          "fun3",
                          Mockito.anyString());
        //
        StaticA.fun3("hello");
        //
        PowerMockito.verifyStatic();
        //
        StaticA.fun3("hello");
        //
        PowerMockito.verifyStatic();
        //
        StaticA.fun3("hello");
    }
    
    /**
     * test07: <br/>
     * success
     * @author xushjie
     * @throws Exception
     * @since JDK 1.7
     */
    @Test
    public void test07() throws Exception {
        //
        PowerMockito.mockStatic(StaticA.class);
        //
        PowerMockito.doNothing()
                    .when(StaticA.class,
                          "fun3",
                          Mockito.anyString());
        //
        StaticA.fun3("hello");
        //
        PowerMockito.verifyStatic();
        //
        StaticA.fun3("hello");
        //
        PowerMockito.verifyStatic();
        //
        StaticA.fun3(Mockito.anyString());
    }
    
    /**
     * test08: <br/>
     * success
     * @author xushjie
     * @throws Exception
     * @since JDK 1.7
     */
    @Test
    public void test08() throws Exception {
        //
        PowerMockito.mockStatic(StaticA.class);
        //
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        PowerMockito.doNothing()
                    .when(StaticA.class,
                          "fun3",
                          captor.capture());
        //
        StaticA.fun3("hello");
        //
        PowerMockito.verifyStatic();
        //
        StaticA.fun3("hello");
        //
        PowerMockito.verifyStatic();
        //
        StaticA.fun3(Mockito.anyString());
        //
        MatcherAssert.assertThat("hello",
                                 CoreMatchers.equalTo(captor.getValue()));
    }
    
}
