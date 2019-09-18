package com.example.ricemachine;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ricemachine.Base.BaseActivity;

public class IDcardActivity extends BaseActivity {

    private TextView skip_qr_code;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idcard);
        skip_qr_code = findViewById(R.id.skip_qr_code);
        skip_qr_code.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        skip_qr_code.getPaint().setAntiAlias(true);
        skip_qr_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //添加点击事件
                Intent intent = new Intent(IDcardActivity.this, QRcodeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.img_id_card);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(IDcardActivity.this,HomePageActivity.class);
                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent1);
            }
        });
    }
}
