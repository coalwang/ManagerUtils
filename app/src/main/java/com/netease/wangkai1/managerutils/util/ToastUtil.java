package com.netease.wangkai1.managerutils.util;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Toast的封装
 */
public class ToastUtil {
    private static Toast toast;  // 静态变量的生命周期从源程序开始到结束，但是它有一定的作用域
    public static void showShortToast(String toastText, Context context){
        if (toast == null){
            toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
        }else{  //toast实例化过，改变duration和text
            if (toast.getDuration() == Toast.LENGTH_LONG)toast.setDuration(Toast.LENGTH_SHORT);
        }
        if ( TextUtils.isEmpty(toastText))return;
        toast.setText(toastText);
        toast.show();

    }

    public static void showLongToast(String toastText, Context context){
        if (toast == null){
            toast = Toast.makeText(context, "", Toast.LENGTH_LONG);
        }else {
            // 修改duration
            if (toast.getDuration() == Toast.LENGTH_SHORT)toast.setDuration(Toast.LENGTH_SHORT);
        }
        if (TextUtils.isEmpty(toastText))return;
        toast.setText(toastText);
        toast.show();
    }

    public static void showShortToast(int res, Context context){
        showShortToast(context.getString(res), context);
    }

    public static void showLongToast(int res, Context context){
        showLongToast(context.getString(res), context);
    }
}

//
//    /**
//     * 显示自定义布局Toast
//     *
//     * @param layout 自定义布局
//     */
//    private static Toast customToast;
//    public static void showCustomToast(int layout, int gravity, int xOffset, int yOffset, OnInitToast onInit) {
//        if (customToast == null) {
//            customToast = new Toast(mContext);
//        }
//        customToast.setDuration(Toast.LENGTH_SHORT);
//        customToast.setGravity(gravity, xOffset, yOffset);
//        View view = LayoutInflater.from(mContext).inflate(layout, null);
//        if (onInit != null) {
//            onInit.onInit(view);
//        }
//        customToast.setView(view);
//        customToast.show();
//    }
//
//    /**
//     * 初始化自定义Toast
//     *
//     * @author lichenyang
//     */
//    public interface OnInitToast {
//        void onInit(View view);
//    }
//
//    /**
//     * 顶部toast
//     */
//    public static void showTopToast(Context context, final int stringRes){
//        if (context == null) return;
//        ToastUtil.showCustomToast(R.layout.layout_toast_refresh_suc, Gravity.TOP, 0,
//                context.getResources().getDimensionPixelSize(R.dimen.toolbar_height) + DeviceUtil.dip2px(context, 16),
//                new OnInitToast() {
//                    @Override
//                    public void onInit(View view) {
//                        TextView contentTv = (TextView) view.findViewById(R.id.content_tv);
//                        contentTv.setText(stringRes);
//                    }
//                });
//    }
//
//}
