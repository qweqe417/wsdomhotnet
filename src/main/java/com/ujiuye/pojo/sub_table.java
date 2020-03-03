package com.ujiuye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分 表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class sub_table {
    /**
     * Meter_name  仪表名
     * Meter_id 仪表ID
     * Meter_factor 仪表系数
     * Pipeline_name 管线名
     * Customer_name 客户名
     * Customer_id 客户Id
     */
    private String Meter_name;
    private Long Meter_id;
    private  String Meter_factor;
    private String Pipeline_name;
    private  String Customer_name;
    private  Long Customer_id;


}
