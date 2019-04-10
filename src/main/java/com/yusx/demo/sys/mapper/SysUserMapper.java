package com.yusx.demo.sys.mapper;

import com.yusx.demo.sys.entity.Menu;
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

    List<String> findRoles(String username);

    List<String> findPermissionsCode(String username);

    List<Menu> findPermissions(String username);
}
