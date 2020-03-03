package com.ujiuye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 角色表
 */

public class Roles {

      private Long Roles_id; //角色 id
      private String  rolename; // 角色名称
      private String company_name; //公司名称
      private  Long Number_of_characters;//角色人数
       private  String Note;//备注


}
