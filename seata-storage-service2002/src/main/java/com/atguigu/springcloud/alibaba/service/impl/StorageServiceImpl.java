package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("StorageServiceImpl扣减配额开始");
        storageDao.decrease(productId,count);
        log.info("StorageServiceImpl扣减配额结束");
    }
}