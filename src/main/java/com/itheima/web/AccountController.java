package com.itheima.web;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p></p>
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("find")
    public List<Account> findAccount(){
        System.out.println("张仕刚");
        List<Account> accountList = accountService.findAll();
        int i = 1;
        System.out.println("kkk");
        return accountList;
    }
}
