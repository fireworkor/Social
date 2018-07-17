package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/06  11:30  星期日
 * 描述  :
 */
@Entity
@Table(name="food_sex_count")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodSex {
       @Id
       @GeneratedValue(strategy= GenerationType.AUTO)
        private String sex;
        private    long num;

}
