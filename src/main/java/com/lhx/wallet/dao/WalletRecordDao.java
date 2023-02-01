package com.lhx.wallet.dao;

import com.lhx.wallet.pojo.WalletRecord;

import java.util.List;

/**
 * @author lhx
 * #Description WalletRecordDao
 * #Date: 2023/1/31 16:08
 */
public interface WalletRecordDao {
    void save(WalletRecord param);
    List<WalletRecord> getList();
}
