/**
* Copyright 2012 Woasis Tech. Co., Ltd.
* All right reserved.
* Project:Woasis PTT V1.0
* Name:JniAdapter.java
* Description:TODO
* Author:LiXiaodong
* Version:1.0
* Date:2012-3-2
*/

package com.woasis.ptt.jni;



/**
 * @author Administrator
 *
 */
public abstract class JniManager {
	
	public static void initJni() {
		System.loadLibrary("pjsip-jni");
	}
}
