package com.lhx.wallet.controller;

import com.lhx.wallet.service.WalletInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhx
 * #Description WalletInfoController
 * #Date: 2023/1/31 16:14
 */
@RestController
@Api(tags = "WalletController",description = "钱包")
@RequestMapping("/wallet/info")
public class WalletInfoController {
    @Autowired
    private WalletInfoService walletInfoService;

    @GetMapping(value = "/getmoney")
    @ApiOperation(value = "查询用户钱包余额")
    public Integer getMonry(String id) {
        return walletInfoService.getMoney(id);
    }
}
