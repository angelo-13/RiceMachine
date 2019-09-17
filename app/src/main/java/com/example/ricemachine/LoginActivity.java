package com.example.ricemachine;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ricemachine.Base.BaseActivity;


public class LoginActivity extends BaseActivity implements View.OnClickListener{

    private Button QRcode;//扫二维码按钮
    private Button IDcard;//刷身份证按钮



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        QRcode = findViewById(R.id.QRcode);
        IDcard = findViewById(R.id.IDcard);
        QRcode.setOnClickListener(this);
        IDcard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.QRcode:
                //在此添加逻辑
                break;
            case R.id.IDcard:
                //在此添加逻辑
                break;
            default:
                break;
        }
    }
}
