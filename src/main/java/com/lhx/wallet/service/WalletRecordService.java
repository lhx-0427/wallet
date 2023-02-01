package com.lhx.wallet.service;

import com.lhx.wallet.pojo.WalletRecord;

import java.util.List;

/**
 * @author lhx
 * #Description WalletRecordService
 * #Date: 2023/2/1 10:44
 */
public interface WalletRecordService {
    void save(WalletRecord param);
    List<WalletRecord> getList();
}
