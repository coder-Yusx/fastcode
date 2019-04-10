package com.yusx.demo.sys.controller;


import com.yusx.demo.common.JsonResult;
import com.yusx.demo.sys.entity.Menu;
import com.yusx.demo.sys.entity.SysPermission;
import com.yusx.demo.sys.service.ISysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.security.Permission;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yusx
 * @since 2019-03-29
 */
@RestController
@RequestMapping("/sys")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping(value = "/login/{username}/{password}",method = RequestMethod.GET)
    public JsonResult login(@PathVariable("username") String username, @PathVariable("password") String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);

        JsonResult result = new JsonResult();
        try {
            subject.login(token);
            result.success();
        }catch (AuthenticationException e){
            if(e instanceof UnknownAccountException){
                result.failure();
            }
            if(e instanceof IncorrectCredentialsException){
                result.failure();
            }
        }finally {
            return result;
        }
    }

    //获取后台左侧菜单
    @RequestMapping(value = "/menus")
    public JsonResult getMenus(){
        JsonResult result = new JsonResult();
        List<Menu> menus = sysUserService.findPermissions("qwert");
        List<Menu> treeMenu = treeMenu(menus, -1);
        result.success(treeMenu);
        return result;
    }

    //递归格式化菜单，把数据库中查出的菜单格式化成树形菜单
    public List<Menu> treeMenu(List<Menu> menus,int id){
        if(menus == null) return null;
        List<Menu> children = new ArrayList<Menu>();
        for(Menu menu : menus){
            if(menu.getParent() == id){
                List<Menu> menus1 = treeMenu(menus, menu.getCode());
                if(menus1 == null) continue;
                menu.setChildren(menus1);
                children.add(menu);
            }
        }
        //if(children.size() == 0) return children;
        return children;
    }

    @RequestMapping(value = "/roles")
    public JsonResult getRoles(){

        Set<String> qwert = sysUserService.findRoles("qwert");
        JsonResult jr = new JsonResult();
        jr.success(qwert);
        return jr;
    }

    @RequestMapping(value = "/permissionscode")
    public JsonResult getPermission(){

        Set<String> qwert = sysUserService.findPermissionsCode("qwert");
        JsonResult jr = new JsonResult();
        jr.success(qwert);
        return jr;
    }
}
