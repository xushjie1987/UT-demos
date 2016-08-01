/**
 * Project Name:demo5
 * File Name:CaptorA.java
 * Package Name:com.oneapm.mockito
 * Date:2016年8月1日下午5:33:44
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.mockito;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName:CaptorA <br/>
 * Function: <br/>
 * Date: 2016年8月1日 下午5:33:44 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class CaptorA {
    
    @Getter
    @Setter
    private String argVal;
    
    public CaptorA(String argVal) {
        this.argVal = argVal;
    }
    
}
