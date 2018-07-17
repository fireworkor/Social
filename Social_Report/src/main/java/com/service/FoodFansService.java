package com.service;


import com.Repository.FoodFansRepository;
import com.bean.FoodFans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/06  8:42  星期日
 * 描述  :
 */
@Service
public class FoodFansService {
    @Autowired
    FoodFansRepository foodFansRepository;
    public Iterable<FoodFans> findAll(){
        return foodFansRepository.findAll();
    }
}
