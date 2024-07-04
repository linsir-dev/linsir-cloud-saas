package com.linsir.saas.modules.system.vo;

import lombok.Data;

import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/09/01 12:50:20
 */

@Data
public class MenuVO {

  private List<SysResourceVO> menu;

  private List<String> permissions;
}
