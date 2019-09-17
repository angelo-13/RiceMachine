package com.example.ricemachine;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ricemachine.Base.BaseActivity;

public class QRcodeActivity extends BaseActivity {

    private TextView skip_IDcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
        skip_IDcard = findViewById(R.id.skip_IDcard);
        skip_IDcard.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        skip_IDcard.getPaint().setAntiAlias(true);
        skip_IDcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //添加点击事件
            }
        });
    }
}
