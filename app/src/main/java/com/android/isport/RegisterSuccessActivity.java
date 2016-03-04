package com.android.isport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class RegisterSuccessActivity extends AppCompatActivity {

    private ImageButton BackHomePage;
    private ImageButton ImprovePersonalInformation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_success);

        BackHomePage = (ImageButton) findViewById(R.id.BackHomepage);      //初始化当前控件
        ImprovePersonalInformation = (ImageButton) findViewById(R.id.ImprovePersonalInformation);    //初始化当前控件

        BackHomePage.setOnClickListener(new View.OnClickListener() {    //设置监听器
            @Override
            public void onClick(View v) {   //跳转首页页面

            }
        });

        ImprovePersonalInformation.setOnClickListener(new View.OnClickListener() {    //设置监听器
            @Override
            public void onClick(View v) {   //跳转完善个人信息页面

            }
        });

    }
}
