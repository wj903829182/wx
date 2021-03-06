package com.jack.message.resp;

import lombok.Data;

/**
 * Created by jack on 2018/3/15.
 */
@Data
public class MusicMessage extends BaseMessage{
    // 音乐名称
    private String Title;
    // 音乐描述
    private String Description;
    // 音乐链接
    private String MusicUrl;
    // 高质量音乐链接，WIFI环境优先使用该链接播放音乐
    private String HQMusicUrl;
    //缩略图的媒体id，通过素材管理中的接口上传多媒体文件，得到的id
    private String ThumbMediaId;
}
