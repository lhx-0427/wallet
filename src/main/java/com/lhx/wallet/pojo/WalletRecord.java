package com.lhx.wallet.pojo;

import com.mysql.cj.conf.PropertyDefinitions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lhx
 * #Description WalletRecord
 * #Date: 2023/1/31 15:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletRecord {
    private String id;
    private String orderId;
    private String walletId;
    private String targetId;
    private Integer type;
    private Date createTime;
    private Integer money;
}
