package com.spring.webmvc.servlet;

import java.time.temporal.ValueRange;
import java.util.Map;

public class MyModelAndView {
    private  String viewName;
    private Map<String,?> model;

    public MyModelAndView(String viewName, Map<String, ?> model) {
        this.viewName = viewName;
        this.model = model;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, ?> getModel() {
        return model;
    }

    public void setModel(Map<String, ?> model) {
        this.model = model;
    }
/*
    public void  put(String key,){
        this.model.put(key,);
    }*/
}
