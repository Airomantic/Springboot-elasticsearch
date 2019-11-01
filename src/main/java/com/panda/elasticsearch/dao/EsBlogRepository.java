package com.panda.elasticsearch.dao;

import com.panda.elasticsearch.entity.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @program: elasticsearch
 * @description:
 * @author: jiangzq
 * @create: 2019-11-01 18:56
 **/
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {
    //分页查询博客
    Page<EsBlog> findByTitleContainingOrSummaryContainingOrContentContaining(String title, String summary, String content, Pageable pageable);
}
