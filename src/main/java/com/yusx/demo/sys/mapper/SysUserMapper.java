package com.yusx.demo.sys.mapper;

import com.yusx.demo.sys.entity.Menu;
import com.yusx.demo.sys.entity.Router;
import com.yusx.demo.sys.entity.SysPermission;
import com.yusx.demo.sys.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yusx
 * @since 2019-03-29
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<String> selectRoleCodesByUsername(String username);

    List<String> selectPermissionCodesByUsername(String username);

    List<Menu> selectUserMenusByUsername(String username);

    List<Router> selectUserRoutersByUsername(String username);
}
