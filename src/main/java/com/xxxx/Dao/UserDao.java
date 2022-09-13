package com.xxxx.Dao;

import com.xxxx.po.User;

public interface UserDao{
    User queryUserByUserId(Integer userId);
}
