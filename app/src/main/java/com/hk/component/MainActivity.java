package com.hk.component;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * author： Created by shiming on 2018/3/20 17:44
 * mailbox：lamshiming@sina.com
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Fragment fragment;
    FragmentTransaction ft;
    Button installReadBookBtn;
    Button uninstallReadBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        installReadBookBtn = findViewById(R.id.install_share);
        uninstallReadBtn = findViewById(R.id.uninstall_share);
        installReadBookBtn.setOnClickListener(this);
        uninstallReadBtn.setOnClickListener(this);
        showFragment();
    }

    private void showFragment() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.install_share:

//                Router.registerComponent("com.luojilab.share.applike.ShareApplike");
//                Router.registerComponent("com.luojilab.share.kotlin.applike.KotlinApplike");
                break;
            case R.id.uninstall_share:
//                Router.unregisterComponent("com.luojilab.share.applike.ShareApplike");
//                Router.unregisterComponent("com.luojilab.share.kotlin.applike.KotlinApplike");
                break;
        }
    }
}
