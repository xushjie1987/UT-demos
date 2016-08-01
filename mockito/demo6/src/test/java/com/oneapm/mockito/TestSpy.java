/**
 * Project Name:demo6
 * File Name:TestSpy.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午4:13:42
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * ClassName:TestSpy <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午4:13:42 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestSpy {
    
    /**
     * test01: <br/>
     * success <br>
     * You can create spies of real objects. When you use the spy then the real methods are called
     * (unless a method was stubbed). Real spies should be used carefully and occasionally, for
     * example when dealing with legacy code.
     * 
     * Spying on real objects can be associated with "partial mocking" concept. Before the release
     * 1.8, Mockito spies were not real partial mocks. The reason was we thought partial mock is a
     * code smell. At some point we found legitimate use cases for partial mocks (3rd party
     * interfaces, interim refactoring of legacy code, the full article is here)
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test01() {
        List list = new LinkedList();
        List spy = spy(list);
        
        // optionally, you can stub out some methods:
        when(spy.size()).thenReturn(100);
        
        // using the spy calls *real* methods
        spy.add("one");
        spy.add("two");
        
        // prints "one" - the first element of a list
        System.out.println(spy.get(0));
        
        // size() method was stubbed - 100 is printed
        System.out.println(spy.size());
        
        // optionally, you can verify
        verify(spy).add("one");
        verify(spy).add("two");
    }
    
    //@formatter:off
    /**
     * test02: <br/>
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
            at java.util.LinkedList.get(LinkedList.java:476)
            at com.oneapm.mockito.TestSpy.test02(TestSpy.java:83)
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
    @SuppressWarnings("rawtypes")
    @Test
    public void test02() {
        List list = new LinkedList();
        List spy = spy(list);
        
        // Impossible: real method is called so spy.get(0) throws IndexOutOfBoundsException (the
        // list is yet empty)
        when(spy.get(0)).thenReturn("foo");
    }
    
    /**
     * test03: <br/>
     * success <br>
     * Sometimes it's impossible or impractical to use when(Object) for stubbing spies. Therefore
     * when using spies please consider doReturn|Answer|Throw() family of methods for stubbing.
     * @author xushjie
     * @since JDK 1.7
     */
    @SuppressWarnings("rawtypes")
    @Test
    public void test03() {
        List list = new LinkedList();
        List spy = spy(list);
        
        // You have to use doReturn() for stubbing
        doReturn("foo").when(spy)
                       .get(0);
    }
    
}
