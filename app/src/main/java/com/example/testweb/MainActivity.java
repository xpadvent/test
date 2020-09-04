package com.example.testweb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.testweb.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button webButton=(Button) findViewById(R.id.button);
        webButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            //this.getApplicationContext();
            // RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

            DBConnect.RegisterRequest(getApplicationContext(),"test","1234567");

            }
        });
        Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }


}
