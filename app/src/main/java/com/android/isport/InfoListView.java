package com.android.isport;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.content.Intent;

/**
 * Created by zyc on 2016/3/5.
 */
public class InfoListView extends Activity {

    private RelativeLayout access_chat;
    private ImageView access_chat_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_info_list_demo);
        access_chat = (RelativeLayout)findViewById(R.id.access_chat_rl_test);
        access_chat_iv = (ImageView)findViewById(R.id.access_chat);
        access_chat_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfoListView.this,ChatActivity.class);
                startActivity(i);
            }
        });
    }
}
