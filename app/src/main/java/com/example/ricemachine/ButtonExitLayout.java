package com.example.ricemachine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class ButtonExitLayout extends LinearLayout {

    private Button exit;

    public ButtonExitLayout(Context context, AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.button_exit,this);
        exit = findViewById(R.id.exit);
        exit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
