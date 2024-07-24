package com.linsir.saas.modules.rabc.mapper;



import com.linsir.saas.modules.rabc.entity.User;
import com.linsir.base.core.mapper.BaseCrudMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/09/01 18:28:52
 */
@Mapper
public interface UserMapper extends BaseCrudMapper<User> {
}
