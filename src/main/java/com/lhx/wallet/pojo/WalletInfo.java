package com.lhx.wallet.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author lhx
 * #Description wallet_info
 * #Date: 2023/1/31 15:35
 */
@Data
public class WalletInfo {
    private String id;
    private Integer walletMoney;
    private String userId;

    private String remark;
    private Date createTime;
}
