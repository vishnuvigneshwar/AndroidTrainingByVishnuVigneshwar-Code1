package com.sguit.trainingapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sguit.trainingapp1.rest.ApiClient;
import com.sguit.trainingapp1.rest.ApiInterface;
import com.sguit.trainingapp1.rest.data.login.ProfileData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home extends AppCompatActivity {

    Button logout;

    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        pref = getApplicationContext().getSharedPreferences("vishnutraining1", 0);
        logout = (Button) findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("isLogin", false);
                editor.commit();
                pref.edit().clear();
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        getProgileInformation();
    }

    void getProgileInformation(){

        ApiInterface stationClient = ApiClient.createService(ApiInterface.class);

        Call<ProfileData> call = stationClient.getProfile("Bearer "+pref.getString("token",""), 2);

        call.enqueue(new Callback<ProfileData>() {
            @Override
            public void onResponse(Call<ProfileData> call, Response<ProfileData> response) {
                ProfileData pd = response.body();

                Toast.makeText(Home.this, "Length of assigned COmpany = "+ pd.getCompanyAssigned().size() , Toast.LENGTH_SHORT).show();
                Toast.makeText(Home.this, "Length of assigned COmpany = "+ pd.getCompanyAssigned().size() , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ProfileData> call, Throwable t) {

            }
        });

    }
}