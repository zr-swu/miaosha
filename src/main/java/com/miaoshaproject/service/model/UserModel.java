package com.miaoshaproject.service.model;

import com.sun.istack.internal.NotNull;

/**
 * @author zr
 * @create 2021-03-19-12:13
 */
public class UserModel {
    private Integer id;

    private String name;

    private Byte gender;

    private Integer age;

    private String telphone;
    private String regisitMode;
    private Integer thirdPartyId;

    private String encrptPassword;

    public String getEncrptPassword() {
        return encrptPassword;
    }

    public void setEncrptPassword(String encrptPassword) {
        this.encrptPassword = encrptPassword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getRegisitMode() {
        return regisitMode;
    }

    public void setRegisitMode(String regisitMode) {
        this.regisitMode = regisitMode;
    }

    public Integer getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(Integer thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }
}
