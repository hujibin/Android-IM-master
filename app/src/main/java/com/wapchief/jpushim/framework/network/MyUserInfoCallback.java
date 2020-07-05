package com.wapchief.jpushim.framework.network;

import cn.jpush.im.android.api.callback.GetUserInfoCallback;
import cn.jpush.im.android.api.model.UserInfo;


public class MyUserInfoCallback extends GetUserInfoCallback{
    @Override
    public void gotResult(int i, String s, UserInfo userInfo) {

    }

    public void errorResult(){

    }
}
