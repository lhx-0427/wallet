package com.lhx.wallet.controller;

import com.lhx.wallet.pojo.WalletRecord;
import com.lhx.wallet.service.WalletRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lhx
 * #Description WalletRecordController
 * #Date: 2023/2/1 11:14
 */
@RestController
@Api(tags = "walletRecordController",description = "出入账明细")
@RequestMapping("/wallet/record")
public class WalletRecordController {
    @Autowired
    private WalletRecordService walletRecordService;
      @PostMapping("/save")
      @ApiOperation(value="消费/退款接口")
      public void save(WalletRecord param){
            walletRecordService.save(param);
      }
      @GetMapping("list")
      @ApiOperation(value="账单明细")
      public List<WalletRecord> getList(){
           return walletRecordService.getList();
      }
}
