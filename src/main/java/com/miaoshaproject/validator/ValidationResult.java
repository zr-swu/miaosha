package com.miaoshaproject.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zr
 * @create 2021-03-20-11:24
 */
public class ValidationResult {

    //检验结果是否有错
    private boolean hasErrors =false;

    //存放错误信息的map
    private Map<String,String> erroMsgMap = new HashMap<>();

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public Map<String, String> getErroMsgMap() {
        return erroMsgMap;
    }

    public void setErroMsgMap(Map<String, String> erroMsgMap) {
        this.erroMsgMap = erroMsgMap;
    }


    //实现通用的通过格式化字符串信息获取错误结果的msg方法
    public String getErrMsg(){
       return StringUtils.join(erroMsgMap.values(),",");//以","拼接
    }
}
