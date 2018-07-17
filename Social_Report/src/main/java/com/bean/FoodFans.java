package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/12  20:31  星期六
 * 描述  :
 */
    @Entity
    @Table(name = "food_fans_count")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
public class FoodFans {
        //"webokeyword","userid","weibocertification","username","sex","area","userlink","introduce","follows","fans","weibo","intro","label","education","profession","headlink","newtime","website"
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private String username;
        private String fans;

    }
