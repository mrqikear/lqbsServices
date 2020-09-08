package com.lqbs.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain  =true)  //chain 编程
public class User {

    private  Long id;

    private String userName;

    private String passWord;

    private  Integer status;

    private  String email;


}
