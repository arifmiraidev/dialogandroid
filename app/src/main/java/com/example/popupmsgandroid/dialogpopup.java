package com.example.popupmsgandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class dialogpopup extends AppCompatActivity {

    LinearLayout layout1,layout2,layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogpopup);

        layout1 = findViewById(R.id.sdlayout);
        layout2 = findViewById(R.id.mdlayout);
        layout3 = findViewById(R.id.ldlayout);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Testing toast small donation",Toast.LENGTH_SHORT).show();
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Testing toast medium donation",Toast.LENGTH_SHORT).show();
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Testing toast large donation",Toast.LENGTH_SHORT).show();
            }
        });

    }
}