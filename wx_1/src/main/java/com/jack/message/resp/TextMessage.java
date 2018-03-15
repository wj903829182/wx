package com.jack.message.resp;

import lombok.Data;

/**
 * Created by jack on 2018/3/15.
 * 回复文本消息
 */
@Data
public class TextMessage extends BaseMessage {
    // 回复的消息内容
    private String Content;
}
