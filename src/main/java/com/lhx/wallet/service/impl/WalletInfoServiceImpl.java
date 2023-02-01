package com.lhx.wallet.service.impl;

import com.lhx.wallet.dao.WalletInfoDao;
import com.lhx.wallet.service.WalletInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lhx
 * #Description WalletInfoServiceImpl
 * #Date: 2023/1/31 22:51
 */
@Service
public class WalletInfoServiceImpl  implements WalletInfoService {
    @Autowired
    private WalletInfoDao walletInfoDao;

    /**
     * 获取钱包余额
     * @param userId
     * @return
     */

    @Override
    public Integer getMoney(String userId) {
        Integer money = walletInfoDao.getMoney(userId);
        return money;
    }


    /**
     * 钱包发生交易
     * @param param
     */
    @Override
    public void moneyChange(Integer param) {

          walletInfoDao.moneyChange(param);
    }
}
