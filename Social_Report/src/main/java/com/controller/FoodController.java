package com.controller;

import com.bean.*;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
public class FoodController {

    @Autowired
    FoodEducationService food_educationService;
    @Autowired
    FoodSexService       food_sexService;
    @Autowired
    FoodFansService foodFansService;
    @Autowired
    FoodFollowsService foodFollowsService;
    @Autowired
    FoodionWeiboService foodionWeiboService;
    @Autowired
    FoodAreaService foodAreaService;

    @RequestMapping("/weibo_food")
    public String weibo_food() {
        return "weibo_food";
    }

    @RequestMapping("/weibo_food2")
    public String weibo_food2() {
        return "weibo_food2";
    }


    @RequestMapping("/weibo_food3")
    public String weibo_food3() {
        return "weibo_food3";
    }

    @PostMapping("/GetPieData")
    @ResponseBody
    public List<FoodSex> GetPieData() {
        Iterable<FoodSex> all  = food_sexService.findAll();
        List              list = new ArrayList<FoodSex>();
        all.forEach(x -> list.add(x));
        System.out.println(list);
        return list;
    }
    @PostMapping("/GetBarData")
    @ResponseBody
    public List<FoodEducation> GetBarData() {
        Iterable<FoodEducation> all  = food_educationService.findAll();
        List                    list = new ArrayList<FoodEducation>();
        all.forEach(x -> list.add(x));
        return list;
    }
    @GetMapping("/GetFoodFansData")
    @ResponseBody
    public List<FoodFans> GetFoodFansData() {
        Iterable<FoodFans> all  = foodFansService.findAll();
        List                  list = new ArrayList<FoodFans>();
        all.forEach(x -> list.add(x));
        return list;
    }
    @GetMapping("/GetFoodWeiboData")
    @ResponseBody
    public List<FoodWeibo> GetFoodWeiboData() {
        Iterable<FoodWeibo> all  = foodionWeiboService.findAll();
        List                  list = new ArrayList<FoodFans>();
        all.forEach(x -> list.add(x));
        return list;
    }
    @GetMapping("/GetFoodFollowsData")
    @ResponseBody
    public List<FoodFollows> GetFoodFollowsData() {
        Iterable<FoodFollows> all  = foodFollowsService.findAll();
        List                  list = new ArrayList<FoodFans>();
        all.forEach(x -> list.add(x));
        return list;
    }



    @PostMapping("/getmapdata")
    @ResponseBody
    public List<FoodArea> GetMapData() {
        Iterable<FoodArea> all  = foodAreaService.findAll();
        List                  list = new ArrayList<FoodArea>();
        all.forEach(x -> list.add(x));
        System.out.println(list);
        return list;
    }
}
