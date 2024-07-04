package com.linsir.saas.modules.organization.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
/*
import com.linsir.saas.common.entity.BaseSaaSEntity;
*/
import com.linsir.base.core.entity.BaseEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @title: Member
 * @projectName lins
 * @description: 成员和账号可以绑定，也可以不绑定
 * @date 2022/1/4 11:45
 */
@Data
@TableName("member")
public class Member extends BaseEntity {
    /*姓名*/
    //@FieldSensitive(type = SensitiveType.chineseName)
    private String name;

   /* 工号*/
    private String memberId;

    /*身份证号码*/
    @NotBlank(message = "不能空")
   //@FieldSensitive(type=SensitiveType.idCard)
    private String idCard;

   // @FieldBind(type = "sex",target = "sexText")
    private int sex;

    @TableField(exist = false)
    private String sexText;


    private int age;

    /*民族*/
    private String national;

    /*籍贯*/
    private String origin;


    /*户籍所在地*/
    //@FieldSensitive(type=SensitiveType.address)
    private String address;

    /*现居住地*/
    //@FieldSensitive(type=SensitiveType.address)
    private String presentAddress;

    /*生日*/
    private Date birthday;

    /*电话*/
    //@FieldSensitive(type=SensitiveType.mobile)
    private String telephone;

    /*婚姻状态*//*
    @FieldBind(type = "marriage",target = "marriageText")*/
    private String marriage;

   /* //绑定显示属性，非表字典（排除）
    @TableField(exist = false)
    private String marriageText;*/

    /*驾照等级*/
    private String drivingLicense;
    

    /*紧急联系人*/
    private String emergencyPerson;

    /*紧急联系人关系*/
    private String emergencyContactRelation;

    /*紧急联系人*/
    //@FieldSensitive(type=SensitiveType.mobile)
    private String emergencyContact;

    /*政治面貌*/
    private String politicsStatus;

    /*毕业学校*/
    private String graduateSchool;

    /*毕业时间*/
    private  Date graduateTime;

    /*最高学历*/
    private String highestDegree;

    /*入职时间*/
    private Date hireDate;

    /*状态*/
    private int status;

    /*备注*/
    private String remark;

}
