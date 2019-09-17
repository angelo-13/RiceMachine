package com.example.ricemachine;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ricemachine.Base.BaseActivity;


public class LoginActivity extends BaseActivity implements View.OnClickListener{

    private Button qr_code;//扫二维码按钮
    private Button id_card;//刷身份证按钮



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        qr_code = findViewById(R.id.qr_code);
        id_card = findViewById(R.id.id_card);
        qr_code.setOnClickListener(this);
        id_card.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.qr_code:
                //在此添加逻辑
                break;
            case R.id.id_card:
                //在此添加逻辑
                break;
            default:
                break;
        }
    }
}
