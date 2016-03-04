package com.android.isport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerButton=(Button)findViewById(R.id.register);   //初始化当前控件
        registerButton.setOnClickListener(new View.OnClickListener() {   //设置监听器
            @Override
            public void onClick(View v) {   //跳转注册成功页面

            }
        });
    }
}
