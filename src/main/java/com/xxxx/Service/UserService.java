package com.xxxx.Service;

import com.xxxx.Dao.UserDao;
import com.xxxx.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private UserDao UserDao;

  public User queryUserByUserId(Integer userId){
    return UserDao.queryUserByUserId(userId);
 }
}