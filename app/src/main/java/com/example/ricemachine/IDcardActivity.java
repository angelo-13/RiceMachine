package com.example.ricemachine;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ricemachine.Base.BaseActivity;

public class IDcardActivity extends BaseActivity {

    private TextView skip_QRcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idcard);
        skip_QRcode = findViewById(R.id.skip_IDcard);
        skip_QRcode.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        skip_QRcode.getPaint().setAntiAlias(true);
        skip_QRcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //添加点击事件
            }
        });
    }
}
