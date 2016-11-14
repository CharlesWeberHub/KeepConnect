package com.weber.keepconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private Button btn_start_service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView(){
        btn_start_service=(Button)findViewById(R.id.btn_start_service);
        btn_start_service.setOnClickListener(this);

        //int a=1125,b=1126,c=1727,d=1728;
        int a=5,b=6,c=11,d=12;

        Log.d("TEST0","多少页："+ Integer.toString(d+a-1));
        Log.d("TEST1","多少页："+ Integer.toString( ((c - b) / 4 + b / 2)*4));


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_start_service:
                Log.i(TAG,"onClick:R.id.btn_start_service");
                Intent intent = new Intent(MainActivity.this,RepeatConnectService.class);
                startService(intent);
                break;

            default:
                break;
        }

    }

}
