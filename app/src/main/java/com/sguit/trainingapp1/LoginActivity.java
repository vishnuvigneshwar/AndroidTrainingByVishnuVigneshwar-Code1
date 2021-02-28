package com.sguit.trainingapp1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.sguit.trainingapp1.rest.ApiClient;
import com.sguit.trainingapp1.rest.ApiInterface;
import com.sguit.trainingapp1.rest.data.login.LoginIp;
import com.sguit.trainingapp1.rest.data.login.ProfileData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private Button loginbutton;

    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbutton = (Button) findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginCheck();
            }
        });


        pref = getApplicationContext().getSharedPreferences("vishnutraining1", 0);

    }

    public void loginCheck(){

        EditText password = (EditText) findViewById(R.id.password);
        EditText email_id = (EditText) findViewById(R.id.email_id);


        ApiInterface stationClient = ApiClient.createService(ApiInterface.class);

        LoginIp input = new LoginIp();
        input.setEmail(""+email_id.getText().toString().trim());
        input.setPassword(""+password.getText().toString());

        Call<ProfileData> call = stationClient.loginUser(input);

        call.enqueue(new Callback<ProfileData>() {
            @Override
            public void onResponse(Call<ProfileData> call, Response<ProfileData> response) {
                ProfileData res = response.body();
                Toast.makeText(LoginActivity.this, "result: "+res.getMessage(), Toast.LENGTH_LONG).show();

                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("isLogin", true);
                editor.putString("token", res.getAccessToken());
                editor.commit();

                Intent i = new Intent(getApplicationContext(), Home.class);
                startActivity(i);
                finish();
            }

            @Override
            public void onFailure(Call<ProfileData> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "error" , Toast.LENGTH_SHORT).show();
                Toast.makeText(LoginActivity.this, "" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}