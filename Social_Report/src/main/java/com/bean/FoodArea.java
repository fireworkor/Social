package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/12  21:57  星期六
 * 描述  :
 */
@Entity
@Table(name = "food_area_count")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodArea {
    @Id
    @GeneratedValue
    private String province;
    private String num;
}
