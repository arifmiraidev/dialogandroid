package com.example.popupmsgandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

//main function
public class MainActivity extends AppCompatActivity {
    //        initialize widget class
    Button popupButton;
    Dialog popupDialog;
    @Override
//    first activity oncreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        displaying main layout
        setContentView(R.layout.activity_main);



//        assign value and creating object
        popupButton= findViewById(R.id.button);
        //popupDialog= new Dialog(this);

//        function called when button is clicked and display new layout
        popupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                popupDialog.setContentView(R.layout.popupwindow);
//                popupDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
//                popupDialog.show();

                Intent intent = new Intent(MainActivity.this,dialogpopup.class);
                startActivity(intent);



//                maketoast();



            }
        });


    }

    void maketoast(){

        Toast.makeText(getApplicationContext(),"Testing toast",Toast.LENGTH_SHORT).show();

    }
}