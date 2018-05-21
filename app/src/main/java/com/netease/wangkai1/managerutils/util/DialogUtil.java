package com.netease.wangkai1.managerutils.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.Window;
import android.view.WindowManager;

import com.netease.wangkai1.managerutils.R;

public class DialogUtil {

    /**
     * 自定义dialog
     * @param context 上下文
     * @param cancelable 是否支持点击dialog外部隐藏dialog
     * @param customLayout 自定义dialog的布局
     */
    public static void showCustomDialog(Context context, boolean cancelable, int customLayout){
        AlertDialog dialog = new AlertDialog.Builder(context).create();
        dialog.setCanceledOnTouchOutside(cancelable);  // 点击其他区域dialog是否消失
        if ( dialog.isShowing()){
            return;
        }else{
            dialog.show();
        }
        WindowManager.LayoutParams params = dialog.getWindow().getAttributes();
        params.width = (int)(DeviceUtil.getScreenWidth((Activity) context)*0.8);
        dialog.getWindow().setAttributes(params);
        Window window = dialog.getWindow();
        window.setContentView(customLayout);
    }

//<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:app="http://schemas.android.com/apk/res-auto"
//    android:orientation="horizontal"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:minHeight="64dp"
//    android:paddingLeft="12dp"
//    android:paddingRight="12dp"
//    android:gravity="center_vertical"
//    android:background="@drawable/dialog_bg">
//
//    <ProgressBar
//    android:layout_width="32dp"
//    android:layout_height="32dp"
//    app:backgroundTint="@color/red"/>
//
//    <LinearLayout
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_marginLeft="12dp"
//    android:orientation="vertical">
//
//        <TextView
//    android:id="@+id/title_tv"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:textAppearance="@style/text_black_middle"
//    android:text="@string/loading"/>
//
//        <TextView
//    android:id="@+id/message_tv"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_marginTop="4dp"
//    android:textAppearance="@style/text_gray_small"
//    android:text="@string/loading"/>
//
//    </LinearLayout>
//
//</LinearLayout>

}
