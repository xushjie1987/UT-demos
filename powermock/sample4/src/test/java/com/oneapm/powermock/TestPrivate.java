/**
 * Project Name:sample4
 * File Name:TestPrivate.java
 * Package Name:com.oneapm.powermock
 * Date:2016年8月2日上午11:28:05
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * ClassName:TestPrivate <br/>
 * Function: <br/>
 * Date: 2016年8月2日 上午11:28:05 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(PrivateA.class)
public class TestPrivate {
    
    /**
     * test01: <br/>
     * @author xushjie
     * @throws Exception
     * @since JDK 1.7
     */
    @Test
    public void test01() throws Exception {
        PrivateA a = PowerMockito.spy(new PrivateA());
        //
        PowerMockito.when(a,
                          "fun3")
                    .thenReturn(100003);
        //
        a.fun1();
        //
        PowerMockito.verifyPrivate(a)
                    .invoke("fun3");
    }
    
    /**
     * test02: <br/>
     * success
     * @author xushjie
     * @throws Exception
     * @since JDK 1.7
     */
    @Test
    public void test02() throws Exception {
        PowerMockito.spy(PrivateA.class);
        //
        PowerMockito.when(PrivateA.class,
                          "fun4")
                    .thenReturn(100004);
        //
        PrivateA.fun2();
        //
        PowerMockito.verifyPrivate(PrivateA.class)
                    .invoke("fun4");
    }
    
    //@formatter:off
    /**
     * test03: <br/>
        Wanted but not invoked com.oneapm.powermock.PrivateA.fun4();
        
        However, there were other interactions with this mockcom.oneapm.powermock.PrivateA.fun2();
        
        .
            at com.oneapm.powermock.TestPrivate.test03(TestPrivate.java:89)
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
     * @throws Exception
     * @since JDK 1.7
     */
    //@formatter:on
    @Test
    public void test03() throws Exception {
        PowerMockito.mockStatic(PrivateA.class);
        //
        PowerMockito.when(PrivateA.class,
                          "fun4")
                    .thenReturn(100004);
        //
        PrivateA.fun2();
        //
        PowerMockito.verifyPrivate(PrivateA.class)
                    .invoke("fun4");
    }
    
}
