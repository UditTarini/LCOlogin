package com.codecrafted.udit.lcologin;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class loginPage extends AppCompatActivity {


    Button arrow,insta,twt,arrow2;
    ImageView login,logup,icon;
    Button fb;

    TextView lco;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        arrow=(Button)findViewById(R.id.arrow);
        arrow2=(Button)findViewById(R.id.arrow2);

        fb=(Button) findViewById(R.id.fb);
        insta=(Button) findViewById(R.id.insta);
        twt=(Button) findViewById(R.id.twt);
        logup=(ImageView)findViewById(R.id.logup);
        icon = (ImageView)findViewById(R.id.imageView2);
        lco=(TextView)findViewById(R.id.textView4);

        login=(ImageView)findViewById(R.id.login);


        arrow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent SignUp = new Intent(loginPage.this, SignUp.class);

                Pair[] pairs = new Pair[10];
                pairs[0]= new Pair <View, String >(arrow, "signup");
                pairs[1]= new Pair <View, String >(arrow, "arrow");
                pairs[2]= new Pair <View, String >(arrow, "fb");
                pairs[3]= new Pair <View, String >(arrow, "insta");
                pairs[4]= new Pair <View, String >(arrow, "twt");
                pairs[5]= new Pair <View, String >(arrow, "logo");
                pairs[6]= new Pair <View, String >(arrow, "lcoName");
                pairs[7]= new Pair <View, String >(arrow, "btn");
                pairs[8]= new Pair <View, String >(arrow, "login");
                pairs[9]= new Pair <View, String >(arrow, "arrow2");




                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(loginPage.this, pairs);

                startActivity(SignUp, options.toBundle());

            }
        });
    }
}

