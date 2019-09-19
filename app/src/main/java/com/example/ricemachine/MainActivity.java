package com.example.ricemachine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button login;
    private TextView title;
    private TextView company;
    private TextView phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title =findViewById(R.id.title);
        company=findViewById(R.id.company);
        phone=findViewById(R.id.phone);
        login = findViewById(R.id.login);
        Typeface typeface= ResourcesCompat.getFont(this,R.font.whzzlsf);
        login.setTypeface(typeface);
        title.setTypeface(typeface);
        phone.setTypeface(typeface);
        login.setTypeface(typeface);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","onRestart");
    }

}

