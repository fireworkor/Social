package com.service;

import com.Repository.UserRepository;
import com.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/06  21:18  星期日
 * 描述  :
 */
public class UserService {

    @Autowired
    UserRepository userRepository;
    public Iterable<User> findAll(){
        return userRepository.findAll();
    }
}
