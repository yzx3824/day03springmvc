package com.yzx.test;

import com.yzx.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: day03springmvc
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-26 22:30
 */
public class TestSpring {
    @Test
    public void run1() {
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = ac.getBean("accountService", AccountService.class);
        // 调用方法
        as.findAll();
    }
}
