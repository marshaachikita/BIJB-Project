package com.example.a81.bijb;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    TextView tv1, tv2, t_user, t_pass, t1, t2;
    Typeface calibri_bold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        tv1 = (TextView) findViewById(R.id.bijb);
        tv2 = (TextView) findViewById(R.id.signin);
        t_user = (TextView) findViewById(R.id.t_user);
        t_pass = (TextView) findViewById(R.id.t_pass);
        t1 = (TextView) findViewById(R.id.t_forget);
        t2 = (TextView) findViewById(R.id.t_connect);

        calibri_bold = Typeface.createFromAsset(getAssets(), "calibrib.ttf");

        tv1.setTypeface(calibri_bold);
        tv2.setTypeface(calibri_bold);
        t_user.setTypeface(calibri_bold);
        t_pass.setTypeface(calibri_bold);
        t1.setTypeface(calibri_bold);
        t2.setTypeface(calibri_bold);
    }
}
