package com.jack.message.resp;

import lombok.Data;

import java.util.List;

/**
 * Created by jack on 2018/3/15.
 * 图文消息
 */
@Data
public class NewsMessage extends BaseMessage {
    // 图文消息个数，限制为10条以内
    private int ArticleCount;
    // 多条图文消息信息，默认第一个item为大图
    private List<Article> Articles;
}
