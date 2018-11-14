package com.example.a81.bijb;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SignUpActivity extends AppCompatActivity {

    TextView user, email, password, gender;
    Typeface calibri_bold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        user = (TextView) findViewById(R.id.t_user);
        email = (TextView) findViewById(R.id.t_email);
        password = (TextView) findViewById(R.id.t_pass);
        gender = (TextView) findViewById(R.id.t_gender);

        calibri_bold = Typeface.createFromAsset(getAssets(), "calibrib.ttf");

        user.setTypeface(calibri_bold);
        email.setTypeface(calibri_bold);
        password.setTypeface(calibri_bold);
        gender.setTypeface(calibri_bold);
    }
}
