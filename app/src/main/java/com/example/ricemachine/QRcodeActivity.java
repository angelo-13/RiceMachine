package com.example.ricemachine;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ricemachine.Base.BaseActivity;

public class QRcodeActivity extends BaseActivity {

    private TextView skip_id_card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
        skip_id_card = findViewById(R.id.skip_id_card);
        skip_id_card.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        skip_id_card.getPaint().setAntiAlias(true);
        skip_id_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //添加点击事件
            }
        });
    }
}
