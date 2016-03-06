package com.android.isport;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.view.View.OnClickListener;
/**
 * Created by zyc on 2016/3/5.
 */
public class ChatActivity extends Activity implements OnClickListener{

    private ImageView mIvSend;
    private ImageView mIvExit;
    private EditText mEditTextContent;
    private ListView mListView;
    private ChatMsgViewAdapter mAdapter;
    private List<ChatMsgEntity> mDataArrays = new ArrayList<ChatMsgEntity>();


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_candy);
        //启动activity时不自动弹出软键盘
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        initView();
        initData();
    }

    public void initView()
    {
        mListView = (ListView) findViewById(R.id.chat_listview);
        mIvSend = (ImageView) findViewById(R.id.chat_send_iv);
        mIvExit = (ImageView) findViewById(R.id.exit_chat);
        mIvSend.setOnClickListener(this);
        mIvExit.setOnClickListener(this);
        mEditTextContent = (EditText) findViewById(R.id.chat_input_et);
    }
    private String[]msgArray = new String[]{"你好，请问你是 ?", "我是你的室友啊"};
    private final static int COUNT = 2;
    public void initData()
    {
        for(int i = 0; i < COUNT; i++)
        {
            ChatMsgEntity entity = new ChatMsgEntity();
            if (i % 2 == 0)
            {
                entity.setMsgType(true);
            }else{
                entity.setMsgType(false);
            }
            entity.setText(msgArray[i]);
            mDataArrays.add(entity);
        }

        mAdapter = new ChatMsgViewAdapter(this, mDataArrays);
        mListView.setAdapter(mAdapter);

    }


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch(v.getId())
        {
            case R.id.chat_send_iv:
                send();
                break;
            case R.id.exit_chat:
                Intent intent = new Intent (ChatActivity.this,InfoListView.class);
                startActivity(intent);
                break;
        }
    }

    private void send()
    {
        String contString = mEditTextContent.getText().toString();
        if (contString.length() > 0)
        {
            ChatMsgEntity entity = new ChatMsgEntity();
            entity.setMsgType(false);
            entity.setText(contString);

            mDataArrays.add(entity);
            mAdapter.notifyDataSetChanged();
            mEditTextContent.setText("");
            mListView.setSelection(mListView.getCount() - 1);
        }
    }

}