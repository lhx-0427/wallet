package com.lhx.wallet.service.impl;

import com.lhx.wallet.dao.WalletRecordDao;
import com.lhx.wallet.pojo.WalletRecord;
import com.lhx.wallet.service.WalletInfoService;
import com.lhx.wallet.service.WalletRecordService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yaml.snakeyaml.introspector.FieldProperty;

import java.util.Date;
import java.util.List;

/**
 * @author lhx
 * #Description WalletRecordServiceImpl
 * #Date: 2023/2/1 10:45
 */
@Service
public class WalletRecordServiceImpl implements WalletRecordService {
    @Autowired
    private WalletRecordDao walletRecordDao;
    @Autowired
    private WalletInfoService walletInfoService;

    @Override
    @Transactional
    public void save(WalletRecord param) {
        param.setCreateTime(new Date());
        walletRecordDao.save(param);
        //获取交易钱包的当前余额
        Integer money = walletInfoService.getMoney(param.getWalletId());
        if (param.getType() == 0) {//表示支出
            money = money - param.getMoney();
            walletInfoService.moneyChange(money);
        } else {
            money = money + param.getMoney();
            walletInfoService.moneyChange(money);
        }

    }

    @Override
    public List<WalletRecord> getList() {

        List<WalletRecord> list = walletRecordDao.getList();
        for(WalletRecord w:list){
            System.out.println(w.toString());
        }
        return list;
    }
}
