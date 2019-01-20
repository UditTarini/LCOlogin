package com.codecrafted.udit.lcologin;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView login;
    ImageView signup;
    TextView lcoName;
    ImageView logdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView=(ImageView) findViewById(R.id.logo);
        login=(ImageView) findViewById(R.id.login);
        signup=(ImageView) findViewById(R.id.signup);
        lcoName=(TextView) findViewById(R.id.lcoName);
        logdown=(ImageView) findViewById(R.id.logdown);
        imageView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent loginPage = new Intent(MainActivity.this, loginPage.class);

                Pair[] pairs = new Pair[4];
                pairs[0]= new Pair <View, String >(imageView, "logo");
                pairs[1]= new Pair <View, String >(imageView, "login");
                pairs[2]= new Pair <View, String >(imageView, "signup");
                pairs[3]= new Pair <View, String >(imageView, "lcoName");





                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);

                startActivity(loginPage, options.toBundle());

            }
        });

    }
}
