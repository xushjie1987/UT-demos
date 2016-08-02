/**
 * Project Name:sample3
 * File Name:TestedA.java
 * Package Name:com.oneapm.powermock
 * Date:2016年8月2日上午11:02:14
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.powermock;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:TestedA <br/>
 * Function: <br/>
 * Date: 2016年8月2日 上午11:02:14 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class TestedA {
    
    public void fun1() {
        NewA a = new NewA();
        System.out.println(a.getVal());
    }
    
    @SuppressWarnings("rawtypes")
    public void fun2() {
        List l = new ArrayList();
        System.out.println(l.size());
    }
    
}
