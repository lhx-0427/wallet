package com.lhx.wallet.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author lhx
 * #Description WalletInfoDao
 * #Date: 2023/1/31 16:08
 */
@Mapper
public interface WalletInfoDao {
     Integer getMoney(String  userId);
     void moneyChange(Integer param);
}
