package com.yusx.demo.utils;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {

    //没有根节点
    private static List<Menu> getChildren(List<Menu> menus, String id){
        if(menus == null) return null;

        List<Menu> menuList = new ArrayList<>();
        for(Menu menu:menus){
            if(menu.getParent() == id){
                List<Menu> children=getChildren(menus,menu.getId());
                menu.setChildren(children);
                menuList.add(menu);
            }
        }
        if(menuList.size() == 0) return menuList;
        return menuList;
    }

    //有根节点
    private static Menu recursionFn(List<Menu> menus, Menu rootMenu) {
        if(menus == null) return null;
        List<Menu> children = new ArrayList<Menu>();
        for(Menu menu : menus){
            if(menu.getParent() == rootMenu.getId()){
                Menu menu1 = recursionFn(menus, menu);
                children.add(menu1);
            }
        }
        if(children.size() == 0) return rootMenu;
        rootMenu.setChildren(children);
        return rootMenu;
    }

    //遍历
    private static void showTree(List<Menu> menuList){
        if(menuList == null) return;
        for(Menu menu:menuList){
            System.out.println(menu.getName());
            if(menu.getChildren() !=null){
                showTree(menu.getChildren());
            }else{
                return;
            }
        }
    }

    public static void main(String[] args) {

        Menu menu = new Menu("1","食材","0",null);
        Menu menu1 = new Menu("2","蔬菜","1",null);
        Menu menu2 = new Menu("3","水果","1",null);
        Menu menu3 = new Menu("4","水产","1",null);
        Menu menu4 = new Menu("5","禽类","1",null);
        Menu menu5 = new Menu("6","畜类","1",null);
        Menu menu6 = new Menu("7","粮食","1",null);
        Menu menu7 = new Menu("8","土豆","2",null);
        Menu menu8 = new Menu("9","冬瓜","2",null);
        Menu menu9 = new Menu("10","辣椒","2",null);
        Menu menu10 = new Menu("11","苹果","3",null);
        Menu menu11 = new Menu("12","梨","3",null);
        Menu menu12 = new Menu("13","鱼","4",null);
        Menu menu13 = new Menu("14","虾","4",null);
        Menu menu14 = new Menu("15","鸡","5",null);
        Menu menu15 = new Menu("16","鸭","5",null);
        Menu menu16 = new Menu("17","猪","6",null);
        Menu menu17 = new Menu("18","牛","6",null);
        Menu menu18 = new Menu("19","羊","6",null);
        Menu menu19 = new Menu("20","水稻","7",null);
        Menu menu20 = new Menu("21","小麦","7",null);
        Menu menu21 = new Menu("22","玉米","7",null);

        List<Menu> menuList = new ArrayList<Menu>();
        menuList.add(menu);
        menuList.add(menu1);
        menuList.add(menu2);
        menuList.add(menu3);
        menuList.add(menu4);
        menuList.add(menu5);
        menuList.add(menu6);
        menuList.add(menu7);
        menuList.add(menu8);
        menuList.add(menu9);
        menuList.add(menu10);
        menuList.add(menu11);
        menuList.add(menu12);
        menuList.add(menu13);
        menuList.add(menu14);
        menuList.add(menu15);
        menuList.add(menu16);
        menuList.add(menu17);
        menuList.add(menu18);
        menuList.add(menu19);
        menuList.add(menu20);
        menuList.add(menu21);

        //Menu menu22 = recursionFn(menuList, menu);
        //System.out.println(menu22);

        List<Menu> menuList1 = getChildren(menuList, "1");
        //System.out.println(menuList1);
        showTree(menuList1);
    }
}
