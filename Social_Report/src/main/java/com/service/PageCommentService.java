package com.service;

import com.Repository.PageCommentRepository;
import com.bean.PageComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/06  15:25  星期日
 * 描述  :
 */
@Service
public class PageCommentService {
    @Autowired
    PageCommentRepository pageCommentRepository;
    public Iterable<PageComment> findAll(){
        return pageCommentRepository.findAll();
    }
}
