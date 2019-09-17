package com.example.ricemachine;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ricemachine.Base.BaseActivity;

public class IDcardActivity extends BaseActivity {

    private TextView skip_qr_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idcard);
        skip_qr_code = findViewById(R.id.skip_id_card);
        skip_qr_code.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        skip_qr_code.getPaint().setAntiAlias(true);
        skip_qr_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //添加点击事件
            }
        });
    }
}
