package com.linsir.saas.modules.rabc.dto;

/*
import com.linsir.common.mp.dto.CommonBaseDto;
*/
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;


@Data
public class AccountDto /*extends CommonBaseDto*/ {

    private String account;

    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$",
    message = "由数字和字母组成，并且要同时含有数字和字母，且长度要在6-16位之间")
    private String password;

    private Boolean enable;

    private String tenantCode ;

    /*过期时间*/
    private String timeExpiration;

    private List<RoleDto> roleDtoList;

    private List<String> roleStrs;

    private List<AuthorityDto> authorityDtoList;

}
