/**
 * Copyright 2012 Woasis Tech. Co., Ltd.
 * All right reserved.
 * Project:Woasis PTT V1.0
 * Name:InterfaceSip.java
 * Description:PTTService 
 * Author:LiXiaodong
 * Version:1.0
 * Date:2012-3-6
 */
package com.woasis.ptt.proxy;

import com.woasis.ptt.exception.PTTException;
import com.woasis.ptt.model.NumberInfo;
import com.woasis.ptt.model.SipServer;
import com.woasis.ptt.model.SipUser;


public interface InterfaceSip {
	
	public int RequestMakeCall(NumberInfo number) throws PTTException;
	
	public int RequestAnswer(int callId)throws PTTException;
	
	public int RequestHangup(int callId)throws PTTException;
	
	public int RequestRegister(SipServer sipServer, SipUser sipUser)throws PTTException;
	
	public int RequestInit() throws PTTException;
	
	public int RequestDestory()throws PTTException;
	
	public int RequestSendMessage(String number, String message) throws PTTException;
	
	public int RequestGetMember(String groupNumber) throws PTTException;
	
	public int RequestApplyPttRight(String groupNumber) throws PTTException;
	
	public int RequestCancelPttRight(String groupNumber) throws PTTException;
	
	public int RequestExitPttUIManually(String groupNumber) throws PTTException;
	
	public int RequestOpenPtt() throws PTTException;
	
	public int RequestMakePttCall(NumberInfo numberInfo);
	
	//methord add by wangjunhui
	public int RequestHoInd(String ip) throws PTTException;
	
	public int RequestGroupNo(String anyGroupNo);
	
	public int RequestSendDTMF(String digit);


}
