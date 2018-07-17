package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/06  18:34  星期日
 * 描述  :
 */
@Entity
@Table(name = "page_forword")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageForword {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String weibowriter;
    private String weibocontent;
    @Column(name = "forword_num")
    private long forword;


}
