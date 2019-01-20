package com.codecrafted.udit.lcologin;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SignUp extends AppCompatActivity {


    Button arrow2,arrow1;
    ImageView login,signup;
    ImageView logup;
    Button fb,insta,twt,btn;
    ImageView icon;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        arrow2=(Button)findViewById(R.id.arrow2);
        fb=(Button) findViewById(R.id.fb);
        insta=(Button) findViewById(R.id.insta);
        twt=(Button) findViewById(R.id.twt);
        logup=(ImageView)findViewById(R.id.logup);
        icon=(ImageView)findViewById(R.id.imageView3);
        arrow1=(Button)findViewById(R.id.arrow1);
        signup=(ImageView) findViewById(R.id.signupView);



        arrow2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent SignUp2 = new Intent(SignUp.this, loginPage.class);

                Pair[] pairs = new Pair[10];
                pairs[0]= new Pair <View, String >(arrow2, "signup");
                pairs[1]= new Pair <View, String >(arrow2, "arrow");
                pairs[2]= new Pair <View, String >(arrow2, "fb");
                pairs[3]= new Pair <View, String >(arrow2, "insta");
                pairs[4]= new Pair <View, String >(arrow2, "twt");
                pairs[5]= new Pair <View, String >(arrow2, "logo");
                pairs[6]= new Pair <View, String >(arrow2, "lcoName");
                pairs[7]= new Pair <View, String >(arrow2, "btn");
                pairs[8]= new Pair <View, String >(arrow2, "login");
                pairs[9]= new Pair <View, String >(arrow2, "arrow2");





                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUp.this, pairs);

                startActivity(SignUp2, options.toBundle());

            }
        });
    }
}

