package com.miaoshaproject.service.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author zr
 * @create 2021-03-19-12:13
 */
public class UserModel {

    /**
     * String name = null;
     * @NotNull: false
     * @NotEmpty: false
     * @NotBlank: false
     *
     * String name = "";
     * @NotNull: true
     * @NotEmpty: false
     * @NotBlank: false
     *
     * String name = " ";
     * @NotNull: true
     * @NotEmpty: true
     * @NotBlank: false
     *
     * String name = "Great answer!";
     * @NotNull: true
     * @NotEmpty: true
     * @NotBlank: true


    javax.validation.UnexpectedTypeException
     @NotEmpty 用在集合类上

     @NotBlank 用在String上面

     @NotNull 用在基本类型上

     如果在基本类型上面用NotEmpty或者NotBlank会出现上面的错误。
     */
    private Integer id;

    @NotBlank(message = "用户名不能为空")
    private String name;

    @NotNull(message = "性别不能不填")
    private Byte gender;

    @NotNull(message = "年龄不能不填")
    @Min(value = 0,message = "年龄必须大于0")
    @Max(value = 150,message = "年龄必须小于150")
    private Integer age;

    @NotBlank(message = "手机号不能为空")
    private String telphone;

    private String regisitMode;

    private Integer thirdPartyId;

    @NotBlank(message = "密码不能为空")
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
