package com.example.ricemachine;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ricemachine.Base.BaseActivity;

public class HomePageActivity extends BaseActivity implements View.OnClickListener {

    private DrawerLayout mDrawerLayout;
    private ImageView help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        help = findViewById(R.id.help);
        help.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.help:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;

            default:
                break;
        }
    }
}
