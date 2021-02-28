package com.sguit.trainingapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SharedPreferences pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // code for opening another activity from one activity


        pref = getApplicationContext().getSharedPreferences("vishnutraining1", 0);


        Intent loginpage = new Intent(getApplicationContext(), LoginActivity.class);
        Intent homepage = new Intent(getApplicationContext(), Home.class);
        if(pref.getBoolean("isLogin", false) == true)
           startActivity(homepage);
            else
            startActivity(loginpage);
    }
}