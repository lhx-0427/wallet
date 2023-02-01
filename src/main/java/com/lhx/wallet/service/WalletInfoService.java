package com.lhx.wallet.service;

/**
 * @author lhx
 * #Description WalletInfoService
 * #Date: 2023/1/31 22:50
 */
public interface WalletInfoService {
    Integer   getMoney(String userId);
    void  moneyChange(Integer param);
}
