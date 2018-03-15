package com.jack.message.req;

/**
 * Created by jack on 2018/3/15.
 * 文本消息
 */
public class TextMessage extends BaseMessage {
    // 消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
