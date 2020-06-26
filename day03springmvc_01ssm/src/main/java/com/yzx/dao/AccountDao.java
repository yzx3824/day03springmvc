package com.yzx.dao;

import com.yzx.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: day03springmvc
 * @description: 帐户dao接口
 * @author: yanzhixian
 * @create: 2020-06-26 22:18
 */
@Repository
public interface AccountDao {
    // 查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

    // 保存帐户信息
    @Insert("insert into account(name, money) values(#{name}, #{money})")
    public void saveAccount(Account account);
}
