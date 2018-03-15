package com.jack.message.resp;

import lombok.Data;

/**
 * Created by jack on 2018/3/15.
 */
@Data
public class VoiceMessage extends BaseMessage {
    /**
     * 通过素材管理中的接口上传多媒体文件，得到的id
     */
    private String MediaId;
}
