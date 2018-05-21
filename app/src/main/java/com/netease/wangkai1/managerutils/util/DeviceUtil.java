package com.netease.wangkai1.managerutils.util;

import android.app.Activity;
import android.content.Context;

/**
 * 获取设备信息的封装
 */
public class DeviceUtil {

    public static int SCREE_WIDTH;
    public static int SCREE_HEIGHT;

    public static int getScreenWidth(Activity context) {
        return context.getWindowManager().getDefaultDisplay().getWidth();
    }

    public static int getScreenHeight(Activity context) {
        return context.getWindowManager().getDefaultDisplay().getHeight();
    }
}
