/**
 * Copyright 2012 Woasis Tech. Co., Ltd.
 * All right reserved.
 * Project:Woasis PTT V1.0
 * Name:PTTException.java
 * Description:TODO
 * Author:LiXiaodong
 * Version:1.0
 * Date:2012-3-7
 */

package com.woasis.ptt.exception;

/**
 * @author Administrator
 * 
 */
public class PTTException extends Exception {

	private static final long serialVersionUID = -6428577016016170967L;

	public PTTException(String message, Throwable exception) {
		super(message, exception);
	}

	public PTTException(String message) {
		super(message);
	}

}
