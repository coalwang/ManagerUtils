package com.netease.wangkai1.managerutils.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.netease.wangkai1.managerutils.R;

public class BaseActivity extends AppCompatActivity{

    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (hasToolBar()){
            initToolBar();
        }
    }
//############################################################################################
    /**
     * 默认没有toolbar
     * @return
     */
    public boolean hasToolBar(){
        return false;
    }

    /**
     * 初始化toolbar
     * 注意初始化之前将actionbar去掉，否则会出现异常
     */
    private void initToolBar() {
//    <android.support.v7.widget.Toolbar
//        android:id="@+id/activity_audio_play_tool_bar"
//        android:layout_width="match_parent"
//        android:layout_height="48dp">
//    </android.support.v7.widget.Toolbar>
        // activity_audio_play_tool_bar:toolbar的id
        //mToolBar = (Toolbar) findViewById(R.id.activity_audio_play_tool_bar);
        if (mToolBar == null) {
            throw new IllegalStateException("Toolbar_actionbar toolbar has not be found in layout,be sure you have define toolbar in the layout");
        } else {
            setSupportActionBar(mToolBar);
            // 左上角图标是否显示，如果设成false，则没有程序图标，仅仅就个标题，否则，显示应用程序图标，这里表示不显示图标
            getSupportActionBar().setDisplayShowHomeEnabled(false);
            // 是否给左上角加上一个返回的图标，true表示加
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            // 设置背景图片
            //mToolBar.setBackgroundResource(R.drawable.toolbar_bg);
            // 设置左边的图标
            //mToolBar.setNavigationIcon(R.drawable.left_back);
            mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
            // 设置字体的风格
            //mToolBar.setTitleTextAppearance(this, R.style.TitleTextStyle);
//        <style name="TitleTextStyle">
//        <item name="android:textColor">@color/second_title_color</item>
//        <item name="android:textSize">15sp</item>
//         </style>
        }
    }
//#######################################################################################
//        <menu xmlns:android = "http://schemas.android.com/apk/res/android"
//        xmlns:
//        app = "http://schemas.android.com/apk/res-auto" >
//	      <item
//        android:
//        id = "@+id/action_clean"
//        app:
//        showAsAction = "always"
//        android:
//        icon = "@drawable/icon_share"
//        android:
//        title = "完成" >
//	     </item >
//       </menu >
//<!--
//ifRoom 会显示在Item中，但是如果已经有4个或者4个以上的Item时会隐藏在溢出列表中。当然个数并不仅仅局限于4个，依据屏幕的宽窄而定
//never 永远不会显示。只会在溢出列表中显示，而且只显示标题，所以在定义item的时候，最好把标题都带上。
//always 无论是否溢出，总会显示。
//withText withText值示意Action bar要显示文本标题。Action bar会尽可能的显示这个标题，但是，如果图标有效并且受到Action bar空间的限制，
//文本标题有可能显示不全。
//collapseActionView 声明了这个操作视窗应该被折叠到一个按钮中，当用户选择这个按钮时，这个操作视窗展开。否则，这个操作视窗在默认的情况下是可见的，
//并且即便在用于不适用的时候，也要占据操作栏的有效空间。
//一般要配合ifRoom一起使用才会有效果。-- >
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
        // 两个参数，第一参数为我们自定义的菜单
        //getMenuInflater().inflate(R.menu.pay_audio_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //点击菜单后回调的方法，这里弹出一个dialog
        //showShareDialog();
        return super.onOptionsItemSelected(item);
    }
}
