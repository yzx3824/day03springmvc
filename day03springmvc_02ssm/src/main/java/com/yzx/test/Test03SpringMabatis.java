package com.yzx.test;

import com.yzx.domain.Account;
import com.yzx.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @program: day03springmvc
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-27 00:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test03SpringMabatis {

    @Autowired
    private AccountService accountService;

    @Test
    public void findAll() {
        List<Account> all = accountService.findAll();
        for(Account account : all) {
            System.out.println(account);
        }
    }

    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("shit");
        account.setMoney(123456d);
        accountService.saveAccount(account);
    }

}
