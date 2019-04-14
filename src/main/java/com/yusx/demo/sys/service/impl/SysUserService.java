package com.yusx.demo.sys.service.impl;

import com.yusx.demo.sys.entity.Menu;
import com.yusx.demo.sys.entity.Router;
import com.yusx.demo.sys.entity.SysPermission;
import com.yusx.demo.sys.entity.SysUser;
import com.yusx.demo.sys.mapper.SysUserMapper;
import com.yusx.demo.sys.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yusx
 * @since 2019-03-29
 */
@Service
public class SysUserService extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public Set<String> findRoleCodesByUsername(String username) {
        List<String> roles = sysUserMapper.selectRoleCodesByUsername(username);
        Set<String> roleSet = new HashSet<>(roles);
        return roleSet;
    }

    @Override
    public Set<String> findPermissionCodesByUsername(String username) {
        List<String> permissions = sysUserMapper.selectPermissionCodesByUsername(username);
        Set<String> permissionSet = new HashSet<>(permissions);
        return permissionSet;
    }

    @Override
    public List<Menu> findUserMenusByUsername(String username) {
        List<Menu> permissions = sysUserMapper.selectUserMenusByUsername(username);
        return permissions;
    }

    @Override
    public List<Router> findUserRoutersByUsername(String username) {
        return sysUserMapper.selectUserRoutersByUsername(username);
    }
}
