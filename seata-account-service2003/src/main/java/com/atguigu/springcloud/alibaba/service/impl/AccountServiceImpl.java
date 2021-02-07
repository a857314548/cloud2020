package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.AccountDao;
import com.atguigu.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        /*try {
            TimeUnit.SECONDS.sleep(20L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        log.info("扣减用户余额开始");
        accountDao.decrease(userId, money);
        log.info("扣减用户余额结束");

    }
}
