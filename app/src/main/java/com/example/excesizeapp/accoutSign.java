package com.example.excesizeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class accoutSign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accout_sign);

        //添加按钮的点击事件
        Button button=(Button) findViewById(R.id.r);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建intent实例
                Intent intent=new Intent(accoutSign.this,totalfgmt.class);
                startActivity(intent);
            }
        });
    }
}
