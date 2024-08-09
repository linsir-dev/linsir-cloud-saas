package com.linsir.saas.modules.rabc.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.base.core.vo.Pagination;
import com.linsir.base.core.vo.jsonResults.JsonResult;
import com.linsir.base.core.vo.results.R;
import com.linsir.logRecord.annotation.OperationLog;
import com.linsir.saas.modules.rabc.dto.UserDto;
import com.linsir.saas.modules.rabc.dto.UserQueryDTO;
import com.linsir.saas.modules.rabc.entity.User;
import com.linsir.saas.modules.rabc.service.impl.UserServiceImpl;
import com.linsir.base.core.controller.BaseCrudRestController;
import com.linsir.saas.modules.rabc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/09/01 18:35:10
 */
@RestController
@RequestMapping("/user/")
public class UserController extends BaseCrudRestController<User> {


    @Autowired
    private UserServiceImpl userService;

    /**
     * @description 获取用户
     * @author Linsir
     * @param
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/8/10 0:58
     */
    @OperationLog(bizId = "#id",bizType = "'get'",msg = "'租户用户'")
    @GetMapping("get/{id}")
    public R get(@PathVariable("id") Long id) throws Exception {
        return exec("根据id的获取",()->{
           return getViewObject(id, UserVO.class);
        });
    }

    public R list(UserQueryDTO userQueryDTO) throws Exception {
         return exec("用户列表",()->{
                    return  null;
         });
    }

    @OperationLog(bizId = "'getPermCode'",bizType = "'getPermCode'",msg = "'获取权限编码'")
    @GetMapping("getPermCode")
    public R getPermCode()
    {
        List<Map<Integer, List<Integer>>> maps = new ArrayList<>();
        Map<Integer, List<Integer>> map1 = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1000);
        list1.add(3000);
        list1.add(5000);
        map1.put(1, list1);
        Map<Integer, List<Integer>> map2 = new HashMap<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(2000);
        list2.add(4000);
        list2.add(6000);
        map2.put(2, list2);
        maps.add(map1);
        maps.add(map2);
        return JsonResult.OK(maps);
    }


    /*@GetMapping("get")
    public JsonResult<String> getUerInfo() throws Exception {
        return (JsonResult<String>) exec("xxxx",()->{
            return JsonResult.OK();
        });
    }*/


    /**
     * 添加用户
     * @param
     * @return
     * @throws Throwable
     */
   /* @PostMapping("add")
     public R add(@RequestBody @Validated UserDto user) throws Throwable {
         return null;
     }*/

    /**
     * 用户列表
     * @param userDto
     * @param page
     * @param pageSize
     * @return
     * @throws Exception
     */
    /* @GetMapping("list")
     public R list(UserDto userDto, @RequestParam(value = "page") int page, @RequestParam(value = "pageSize") int pageSize) throws Exception {
         R result = null;
         QueryWrapper queryWrapper = buildQueryWrapperByDTO(userDto);
         Pagination pagination = new Pagination(UserDto.class);
         pagination.setPageSize(pageSize);
         pagination.setPageIndex(page);

         result = exec("获取用户列表",()->{
            List<UserVO> userVOList = userService.getViewObjectList(queryWrapper,pagination,UserVO.class);
             PageVO<UserVO,Summary> pageVO = new PageVO<>(pagination,userVOList);
             return Result.SUCCESS(pageVO);
         });

         return result;
     }*/


     /** 
     * @Description: 获取 用户信息
     * @Param: com.linsir.core.vo.IResult 
     * @return: [id] 
     * @Author: linsir
     * @Date: 12:54 2023/4/11 
     */ 
    /* @GetMapping("get/{id}")
     public R get(@PathVariable("id") Long id) throws Exception {
        R result = null;
        result = exec("根据id获取用户信息",()->{
          UserVO userVO = userService.getViewObject(id, UserVO.class);
          return Result.SUCCESS(userVO);
        });
        return  result;
     }*/

    /* @GetMapping("getUserInfo")
     public R getUserInfo() throws Exception {
         R result = null;
         result = exec("获取当前用户信息",()->{
             UserInfoModel userInfoModel = new UserInfoModel();
             userInfoModel.setUserId(1492067794790760450L);
             return Result.SUCCESS(userInfoModel);
         });
         return result;
     }*/



    //@Autowired
    //private AccountServiceImpl accountService;


//     /**
//      * 添加账号
//      * @param accountDto
//      * @return
//      * @throws Throwable
//      */
//     @PostMapping ("add")
//     public IResult add(@RequestBody @Validated AccountDto accountDto) throws Throwable {
//          accountDto.setFeatures(AuthFeatures.ACCOUNT_ADD);
//          accountDto.setExceptionCode(BaseExceptionCode.ADD_ERROR);
//          return exec("添加账号信息",accountDto,()->{
//             return accountService.add(accountDto);
//          });
//     }
//
//     /**
//      * 删除账号
//      * @param id
//      * @return
//      */
//     @GetMapping("del/{id}")
//     public IResult del(@PathVariable("id") Long id) throws Throwable {
//          BaseDto baseDto = new BaseDto();
//          baseDto.setFeatures(AuthFeatures.ACCOUNT_DEL);
//          baseDto.setExceptionCode(BaseExceptionCode.DEL_ERROR);
//          return exec("删除账号",baseDto,()->{
//               return accountService.del(baseDto);
//          });
//     }
//
//     public IResult update(@RequestBody @Validated AccountDto accountDto) throws Throwable {
//          accountDto.setFeatures(AuthFeatures.ACCOUNT_UPDATE);
//          accountDto.setExceptionCode(BaseExceptionCode.ADD_ERROR);
//          return exec("更新账号信息",accountDto,()->{
//               return accountService.update(accountDto);
//          });
//     }
//
    /**
     * 获取账号信息
     * @param id
     * @return
     */
//    @GetMapping("get/{id}")
//    public JsonResult get(@PathVariable("id") Long id) throws Throwable {
//        return exec(()->{
//            JsonResult<AccountVO> accountVO = getViewObject(id,AccountVO.class);
//            return accountVO;
//        });
//    }
//
//     /**
//      * @params [accountDto]
//      * @return com.linsir.common.common.result.IResult
//      * @author Administrator
//      * @date 2022/2/11 13:55
//      *
//      * 给账号添加角色
//      */
//     @PostMapping("addRoles")
//     public IResult addRoles(@RequestBody Map<String,Object> rolesPara) throws Throwable {
//          ParameterDto parameterDto = new ParameterDto();
//          parameterDto.setParameters(rolesPara);
//          parameterDto.setFeatures(AuthFeatures.ACCOUNT_ADD_ROLES);
//          parameterDto.setExceptionCode(BaseExceptionCode.ADD_ERROR);
//          return exec("添加账号角色",parameterDto,()->{
//               return accountService.setAccountRoles(parameterDto);
//          });
//     }
}
