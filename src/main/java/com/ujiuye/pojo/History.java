package com.ujiuye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 记录表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class History {

     private Long recording; //记录Id
     private float balance;//剩余金额
     private  float pressure; //压力
     private float temperature ; //温度
     private  float Instantaneous_flow; //瞬时流量
     private  float frequency; //频率
     private  float  Cumulative_traffic; //累计流量
     private  float density; //密度
     private float Dryness; //干度
     private  Long  Power_off_times; //断电次数
     private  Long Power_off_time ;//断电时长
     private  String Meter_factor; //仪表系数
     private  String Pipeline_name; //管线名
     private   Long  Power_status ;//供电状态
     private  Long Valve_status; //阀门状态
     private Date Acquisition_time; //采集  时间
     private  Long device; //设备id

}
