package com.controller;


import com.bean.PageComment;
import com.bean.PageForword;
import com.bean.PageLike;
import com.service.PageCommentService;
import com.service.PageForwordService;
import com.service.PageLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/05  13:30  星期六
 * 描述  :
 */
@Controller
public class PageController {

@Autowired
PageCommentService pageCommentService;
@Autowired
PageLikeService    userLikeService;
@Autowired
PageForwordService pageForwordService;
    @RequestMapping("/weibo_page")
    public String weibo_page() {
        return "weibo_page";
    }

    @GetMapping("/GetCommentData")
    @ResponseBody
    public List<PageComment> GetCommentData() {
        Iterable<PageComment> all  = pageCommentService.findAll();
        List                  list = new ArrayList<PageComment>();
        all.forEach(x -> list.add(x));
        return list;
    }
    @GetMapping("/GetLikeData")
    @ResponseBody
    public List<PageLike> GetLikeData() {
        Iterable<PageLike> all  = userLikeService.findAll();
        List               list = new ArrayList<PageLike>();
        all.forEach(x -> list.add(x));
        return list;
    }
    @GetMapping("/GetForwordData")
    @ResponseBody
    public List<PageForword> GetForwordData() {
        Iterable<PageForword> all  = pageForwordService.findAll();
        List                  list = new ArrayList<PageForword>();
        all.forEach(x -> list.add(x));
        return list;
    }


}
