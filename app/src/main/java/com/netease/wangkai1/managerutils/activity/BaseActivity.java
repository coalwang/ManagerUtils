package com.netease.wangkai1.managerutils.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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

    /**
     * 默认没有toolbar
     * @return
     */
    public boolean hasToolBar(){
        return false;
    }

    private void initToolBar(){
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



}
