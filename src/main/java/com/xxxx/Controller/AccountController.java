package com.xxxx.Controller;

import com.xxxx.Service.AccountService;
import com.xxxx.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;
    /*
     * restful --> get 请求，执行查询操作
     * @param id
     * @return
     */
    @GetMapping("account/{id}")
    @ResponseBody
    public Account queryAccountById(@PathVariable Integer id){
    return accountService.selectById(id);
    }
    /* restful-->delete 请求 执行删除操作
     * @param id
     * @return
     */
    @DeleteMapping("account/{id}")
    @ResponseBody
    public Map<String,Object> deleteAccount(@PathVariable Integer id){
    int result = accountService.delAccount(id);

    Map<String,Object> map=new HashMap<String,Object>();
    if(result == 1 ){
        map.put("msg","success");
        map.put("code",200);
  } else {
        map.put("msg","error");
        map.put("code",500);
  }
    return map;
    }
     /*restful --> post 请求，执行添加操作
     * @return*/

    @PostMapping("account")
    @ResponseBody
    public Map<String,Object> saveAccount(@RequestBody   Account account){
    int result = accountService.saveAccount(account);
    Map<String,Object> map=new HashMap<String,Object>();
    if(result == 1 ){
        map.put("msg","success");
        map.put("code",200);
  } else {
        map.put("msg","error");
        map.put("code",500);
  }
    return map;
    }
 /*    restful-->put 请求执行更新操作
     * @param id
     * @param account
     * @return*/

    @PutMapping("account")
    @ResponseBody
    public Map<String,Object> updateAccount(@RequestBody   Account account){
    int result = accountService.updateAccount(account);
    Map<String,Object> map=new HashMap<String,Object>();
    if(result == 1 ){
        map.put("msg","success");
        map.put("code",200);
  } else {
        map.put("msg","error");
        map.put("code",500);
  }
    return map;
    }
}
