package com.xxxx.Dao;
import com.xxxx.po.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

    @Repository
    public interface AccountDao {
    public Account selectById(Integer id);
    public int save(Account account);
    public int update(Account account);
    public int delete(Integer id);
  
    }

