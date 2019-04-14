package com.yusx.demo.shiro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yusx.demo.sys.entity.SysUser;
import com.yusx.demo.sys.service.ISysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 自定义 Realm
 * @Date 2018-03-25
 * @Time 21:46
 */
@Component
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private ISysUserService sysUserService;

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();
        SysUser user = sysUserService.getOne(new QueryWrapper<SysUser>().eq("username",username));
        if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }
        if("0".equals(user.getValidateState())) {
            throw new LockedAccountException(); //帐号锁定
        }
        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUserName(), //用户名
                user.getPassword(), //密码
                ByteSource.Util.bytes(user.getSalt()),//salt=username+salt
                getName()  //realm name
        );
        return authenticationInfo;
    }

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String)principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(sysUserService.findRoleCodesByUsername(username));
        authorizationInfo.setStringPermissions(sysUserService.findPermissionCodesByUsername(username));
        return authorizationInfo;
    }

}
