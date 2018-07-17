package com.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/12  20:22  星期六
 * 描述  :
 * <p>
 * * 博主的关注人数topn，发微博最多的博主topn，粉丝数量最高的用户topn
 */
@Entity
@Table(name = "food_weibo_count")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodWeibo {
    //"webokeyword","userid","weibocertification","username","sex","area","userlink","introduce","follows","fans","weibo","intro","label","education","profession","headlink","newtime","website"
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String username;
    private String weibo;

}
