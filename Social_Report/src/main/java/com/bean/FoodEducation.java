package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/06  8:27  星期日
 * 描述  :
 */
@Entity
@Table(name = "food_education_count")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodEducation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String education;
    private Long   num;

}
