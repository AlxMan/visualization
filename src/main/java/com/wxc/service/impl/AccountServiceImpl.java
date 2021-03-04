package com.wxc.service.impl;

import com.wxc.mapper.AccountMapper;
import com.wxc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional //事物
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper mapper;

    @Override
    public int transfer(String inName, String outName, double money) {

        try {

            mapper.transferIn(inName, money);

            mapper.transferOut(outName, money);
            return 0;


        } catch (Exception e) {
            System.out.println(e);
            return 1;
        }

    }
}
