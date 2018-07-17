package com.service;


import com.Repository.FoodAreaRepository;
import com.Repository.FoodEducationRepository;
import com.bean.FoodArea;
import com.bean.FoodEducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/06  8:42  星期日
 * 描述  :
 */
@Service
public class FoodAreaService {
    @Autowired
    FoodAreaRepository foodAreaRepository;
    public Iterable<FoodArea> findAll(){
        return foodAreaRepository.findAll();
    }
}
