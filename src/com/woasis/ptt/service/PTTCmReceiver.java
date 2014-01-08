/**
 * Copyright 2012 Woasis Tech. Co., Ltd.
 * All right reserved.
 * Project:Woasis PTT V1.0
 * Name:PTTKeyReceiver.java
 * DescriptionTTReceiver
 * Author:LiXiaodong
 * Version:1.0
 * Date:2012-3-17
 */

package com.woasis.ptt.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.woasis.ptt.R;
import com.woasis.ptt.exception.PTTException;
import com.woasis.ptt.model.EnumLoginState;
import com.woasis.ptt.proxy.SipProxy;
import com.woasis.ptt.service.StateManager.EnumRegByWho;
import com.woasis.ptt.util.PTTConstant;
import com.woasis.ptt.util.PTTUtil;

/**
 * @author Administrator
 * 
 */
public class PTTCmReceiver extends BroadcastReceiver {

	private static final String LOG_TAG = "PTTCmReceiver";

	private Context context;

	private static boolean bAutoStartFlag = false;
	private static boolean bDebug = true;

	private PTTUtil pttUtil = PTTUtil.getInstance();

	@Override
	public void onReceive(Context context, Intent intent) {

		this.context = context;

		String action = null;
		if (intent != null)
			action = intent.getAction();

		if (action == null || action.length() == 0) {
			return;
		}
		
		handleBootCompletedEvent(action);

	}

	private void handleBootCompletedEvent(String action) {
		// auto start
		if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
			bAutoStartFlag = true;
		}
	}
}
