package com.service;

import com.Repository.FoodFollowsRepository;
import com.bean.FoodFollows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/12  20:35  星期六
 * 描述  :
 */
    @Service
public class FoodFollowsService {
        @Autowired
        FoodFollowsRepository foodFollowsRepository;
        public Iterable<FoodFollows> findAll(){
            return foodFollowsRepository.findAll();
        }
    }
