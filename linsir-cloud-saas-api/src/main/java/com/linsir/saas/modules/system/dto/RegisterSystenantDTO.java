package com.linsir.saas.modules.system.dto;

import com.linsir.base.core.dto.BaseDTO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author linsir
 * @version 1.0.0
 * @title RegisterSystenantDTO
 * @description  注册用户的dto
 * @create 2024/7/7 7:13
 */

@Data
public class RegisterSystenantDTO extends BaseDTO {

    private String name;
    @NotNull(message = "电话不能为空")
    private String tel;

}
