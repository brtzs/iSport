package com.android.isport;

/**
 * Created by dell on 2016/3/6.
 */

/**
 * Created by zyc on 2016/3/5.
 */
public class ChatMsgEntity {
    private static final String TAG = ChatMsgEntity.class.getSimpleName();
    private String text;
    private boolean isComMeg = true;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getMsgType() {
        return isComMeg;
    }

    public void setMsgType(boolean isComMsg) {
        isComMeg = isComMsg;
    }

    public ChatMsgEntity() {
    }

    public ChatMsgEntity(String text, boolean isComMsg) {
        super();
        this.text = text;
        this.isComMeg = isComMsg;
    }

}
