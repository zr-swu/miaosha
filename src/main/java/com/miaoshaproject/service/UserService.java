package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @author zr
 * @create 2021-03-19-12:05
 */
public interface UserService {
    //通过用户id获取用户对象的方法
    public UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;


    /**
     *
     * @param telphone 用户注册手机
     * @param encrptPassword 用户加密密码
     * @throws BusinessException
     */
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
