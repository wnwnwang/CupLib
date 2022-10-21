package com.example.mycup;


import android.os.Bundle;

import com.example.cuplib.BaseActivity;
import com.example.cuplib.TestUtil;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestUtil.myPrint("tom");
    }
}