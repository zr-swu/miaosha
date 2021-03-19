package com.miaoshaproject.error;

/**
 * @author zr
 * @create 2021-03-19-14:12
 */
/*
声明为接口 枚举和自定义异常类当中都要用
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
