package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/06  18:23  星期日
 * 描述  :
 */
@Entity
@Table(name = "page_like")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageLike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String weibowriter;
    private String weibocontent;
    @Column(name = "like_num")
    private long   like;


}
