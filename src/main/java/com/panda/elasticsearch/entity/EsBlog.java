package com.panda.elasticsearch.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @program: elasticsearch
 * @description:
 * @author: jiangzq
 * @create: 2019-11-01 18:44
 **/
@Document(indexName = "blog",type = "blog")           //文档
public class EsBlog implements Serializable {
    @Id
    private String id;
    private String title;
    private String summary;
    private String content;

    public EsBlog(String id, String title, String summary) {//JPA的规范要求无参构造函数，设为protected以防止直接使用

    }

    public EsBlog(String id, String title, String summary, String content) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format(
                "EsBlog[id='%s',title='%s',summary='%s',content='%s']",
                id,title,summary,content
        );
    }
}
