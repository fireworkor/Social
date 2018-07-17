package com.service;

import com.Repository.FoodSexRepository;
import com.bean.FoodSex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/06  8:42  星期日
 * 描述  :
 */
@Service
public class FoodSexService {
    @Autowired
    FoodSexRepository food_sexRepository;
    public Iterable<FoodSex> findAll(){
        return food_sexRepository.findAll();
    }
}
