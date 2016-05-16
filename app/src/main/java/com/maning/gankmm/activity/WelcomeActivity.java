package com.maning.gankmm.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.maning.gankmm.R;
import com.maning.gankmm.app.MyApplication;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        MyApplication.getHandler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
                WelcomeActivity.this.finish();
            }
        },2000);

    }
}