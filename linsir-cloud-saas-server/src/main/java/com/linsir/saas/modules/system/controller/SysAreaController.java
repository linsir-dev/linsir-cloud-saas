package com.linsir.saas.modules.system.controller;

/*import com.linsir.core.controller.BaseCrudRestController;
import com.linsir.core.util.BeanUtils;
import com.linsir.core.vo.R;
import com.linsir.core.vo.Result;
import com.linsir.core.vo.jsonResults.ResResult;*/
import com.linsir.saas.modules.system.entity.SysArea;
import com.linsir.saas.modules.system.service.impl.SysAreaServiceImpl;
import com.linsir.saas.modules.system.vo.SysAreaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/25 16:51:05
 */
@RestController
@RequestMapping("/v1/sysArea/")
public class SysAreaController /*extends BaseCrudRestController<SysArea>*/ {


    @Autowired
    private SysAreaServiceImpl sysAreaService;

    /**
     * 根据父节点，获取树形菜单
     * @param parentId
     * @return
     * @throws Exception
     */
    /*@GetMapping("sysAreaTree")
    public ResResult sysAreaTree(Long parentId) throws Exception {
        R result = null;
        result = exec("获取区域列表",()->{
            List<SysArea> sysAreas = sysAreaService.list();
            List<SysAreaVO> sysAreaVos = BeanUtils.convertList(sysAreas, SysAreaVO.class);
            List<SysAreaVO> sysAreaVoList =BeanUtils.buildTreeChildren(parentId,sysAreaVos,"parentId","children");
            return Result.SUCCESS(sysAreaVoList);
        });
        return new ResResult<>(result);
    }*/
}
