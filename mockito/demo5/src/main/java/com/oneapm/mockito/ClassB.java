/**
 * Project Name:demo5
 * File Name:ClassB.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午2:48:19
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import java.security.SecureRandom;

/**
 * ClassName:ClassB <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午2:48:19 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class ClassB {
    
    public int fun1() {
        return new SecureRandom().nextInt();
    }
    
}
