package com.Repository;


import com.bean.FoodArea;
import com.bean.FoodEducation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/05  11:21  星期六
 * 描述  :
 */
@Repository
public interface FoodAreaRepository extends CrudRepository<FoodArea,String> {

}
