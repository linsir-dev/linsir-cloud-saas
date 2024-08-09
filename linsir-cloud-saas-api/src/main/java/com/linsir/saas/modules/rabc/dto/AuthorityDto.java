package com.linsir.saas.modules.rabc.dto;

/*import com.linsir.common.mp.dto.BaseDto;
import com.linsir.common.mp.dto.CommonBaseDto;*/
import lombok.Data;

/**
 * @author: Administrator
 * @date: 2022/2/15 13:31
 * @description:
 */
@Data
public class AuthorityDto /*extends CommonBaseDto*/ {

    /*权限因子名称*/
    private String name;

    /*应用id*/
    private String applicationId;

    /*父 id*/
    private Long parentId;

    /*菜单id*/
    private String menuId;

    /*url*/
    private String urlPerm;

    /*按钮*/
    private String btnPerm;
}
