package com.example.a81.bijb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jgabrielfreitas.core.BlurImageView;

public class MainActivity extends AppCompatActivity {

    TextView st1,st2,st3,st4;
    Typeface calibri,calibri_bold;
    BlurImageView blurImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        st1 = (TextView) findViewById(R.id.welcome);
        st2 = (TextView) findViewById(R.id.bijb);
        st3 = (TextView) findViewById(R.id.bandara);
        st4 = (TextView) findViewById(R.id.kertajati);

        calibri = Typeface.createFromAsset(getAssets(), "calibri.ttf");
        calibri_bold = Typeface.createFromAsset(getAssets(), "calibrib.ttf");

        st1.setTypeface(calibri_bold);
        st2.setTypeface(calibri_bold);
        st3.setTypeface(calibri);
        st4.setTypeface(calibri_bold);

        blurImage = (BlurImageView) findViewById(R.id.bg_image);
        blurImage.setBlur(2);

        Button sign_in = (Button) findViewById(R.id.btn_signin);
        Button sign_up = (Button) findViewById(R.id.btn_signup);

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(i);
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

    }
}
