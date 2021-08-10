package com.gaoyj.submodule;

import android.content.Context;
import android.widget.Toast;

/**
 * 测试
 * @author 517987
 * @date 2021/8/10
 */
public enum Test {
    INSTANCE;
    public static Test getInstance(){
        return INSTANCE;
    }

    public void test(Context context){
        Toast.makeText(context, "子模块 测试", Toast.LENGTH_SHORT).show();
    }

}
