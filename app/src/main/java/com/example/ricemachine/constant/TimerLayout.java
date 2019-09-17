package com.example.ricemachine.constant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ricemachine.R;

public class TimerLayout extends LinearLayout {

    private TextView tv_timer;
    private ImageView img_timer;

    public TimerLayout(Context context, AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.timer,this);
        tv_timer = findViewById(R.id.tv_timer);
        img_timer = findViewById(R.id.img_timer);
    }
}
