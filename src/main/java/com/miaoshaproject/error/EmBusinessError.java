package com.miaoshaproject.error;

/**
 * @author zr
 * @create 2021-03-19-14:13
 */
public enum EmBusinessError implements CommonError{
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    //2000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在")
    ;


    private int errCode;
    private String errMsg;

    private EmBusinessError(int errCod,String errMsg){
        this.errCode = errCod;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
