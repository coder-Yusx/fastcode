package com.yusx.demo.sys.entity;

import java.util.List;

public class Router {
    private String id;

    private String parent;

    private String routerPath;

    private String routerName;

    private String routerComponent;

    private List<Router> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getRouterPath() {
        return routerPath;
    }

    public void setRouterPath(String routerPath) {
        this.routerPath = routerPath;
    }

    public String getRouterName() {
        return routerName;
    }

    public void setRouterName(String routerName) {
        this.routerName = routerName;
    }

    public String getRouterComponent() {
        return routerComponent;
    }

    public void setRouterComponent(String routerComponent) {
        this.routerComponent = routerComponent;
    }

    public List<Router> getChildren() {
        return children;
    }

    public void setChildren(List<Router> children) {
        this.children = children;
    }
}
