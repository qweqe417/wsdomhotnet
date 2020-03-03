package com.ujiuye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 交易表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

     private  Long  transaction_id; //交易id
     private  String clients_name; //客户名称
     private  Long Customer_id; //客户id
     private  float Payment_amount;//缴费金额
     private  String Manager;//经办人
     private Date Payment_time; //缴费时间
     private  Long Recharge_status ;//充值状态
     private  String Note ;//备注
}
