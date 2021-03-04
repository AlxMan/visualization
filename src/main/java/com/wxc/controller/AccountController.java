package com.wxc.controller;

import com.wxc.common.ResponseCode;
import com.wxc.common.ServerResponse;
import com.wxc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService service;

    @RequestMapping("transfer.do")
    @ResponseBody
    public ServerResponse<String> accountTransfer(String inName, String outName, double money) {
        int status = service.transfer(inName, outName, money);
        if (ResponseCode.SUCCESS.getCode() == status) {
           return ServerResponse.createBySuccessMsg("success");
        }else{
            return ServerResponse.createByErrorMsg("error");
        }
    }
}
