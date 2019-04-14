package com.yusx.demo.sys.service;

import com.yusx.demo.sys.entity.Menu;
import com.yusx.demo.sys.entity.Router;
import com.yusx.demo.sys.entity.SysPermission;
import com.yusx.demo.sys.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yusx
 * @since 2019-03-29
 */
public interface ISysUserService extends IService<SysUser> {

    Set<String> findRoleCodesByUsername(String username);

    Set<String> findPermissionCodesByUsername(String username);

    List<Menu> findUserMenusByUsername(String username);

    List<Router> findUserRoutersByUsername(String username);
}
