package com.netease.wangkai1.managerutils.util;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.WindowManager;

public class DialogUtil {

    public static Dialog showCustomDialog(Context context, boolean cancelable){
        AlertDialog dialog = new AlertDialog.Builder(context).create();
        dialog.setCanceledOnTouchOutside(cancelable);  // 点击其他区域dialog是否消失
        if ( dialog.isShowing()){
            return null;
        }else{
            dialog.show();
        }
        WindowManager.LayoutParams params = dialog.getWindow().getAttributes();
        params.width =
    }

//        WindowManager.LayoutParams params = dlg.getWindow().getAttributes();
//
        params.width = (int) (DeviceUtil.SCREEN_WIDTH * 0.8);
//        PalLog.d(TAG, "width-->" + params.width + "height-->" + params.height);
//        dlg.getWindow().setAttributes(params);
//        Window window = dlg.getWindow();
//        window.setContentView(yourDlgLayout);
//        l.onDialogInitListener(dlg);
//        return dlg;
//    }
}
