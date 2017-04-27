package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15017569 on 4/27/2017.
 */

class Module {
    private String module;
    private boolean imgtype;
    public Module(String module, boolean imgtype){
        this.imgtype=imgtype;
        this.module=module;
    }
    public String getModule(){
        return module;
    }
    public boolean isImgtype(){
        return imgtype;
    }
}