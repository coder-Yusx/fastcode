package com.yusx.demo.utils;

import java.util.List;

public class Menu {

    private String id;

    private String name;

    private String parent;

    private List<Menu> children;

    public Menu() {}

    public Menu(String id, String name, String parent, List<Menu> children) {
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}
