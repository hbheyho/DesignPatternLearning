package com.hb.design.principle.singleresponsibility;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  11:24  2020/1/7.
 */
public class Method {
    public void updateUserInfo(String usrname, String address){
        usrname = "hb";
        address = "深圳";
    }

    // ...表示可变长参数
    public void updateUserInfo(String usrname, String ...properties){
        usrname = "hb";
    }

    // 把上述对用户名和地址的修改分离为两个方法
    public void updateUserName(String usrname){
        usrname = "hb";
    }
    public void updateUserAddress(String address){
        address = "深圳";
    }

}
