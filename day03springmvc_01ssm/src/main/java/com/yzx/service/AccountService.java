package com.yzx.service;

import com.yzx.dao.AccountDao;
import com.yzx.domain.Account;

import java.util.List;

/**
 * @program: day03springmvc
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-26 22:20
 */
public interface AccountService {
    // 查询所有账户
    public List<Account> findAll();

    // 保存帐户信息
    public void saveAccount(Account account);
}
