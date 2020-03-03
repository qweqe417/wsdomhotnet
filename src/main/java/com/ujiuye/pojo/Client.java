package com.ujiuye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    /**
     client_id 客户id
     client_name 客户名字
     device_id 设备id
     Pipe_name 管道名称
     username  账号
     password 密码
     */
    private  Long client_id;
    private String client_name;
    private Long device_id;
    private String Pipe_name;
    private  String username;
    private  String password;
}
