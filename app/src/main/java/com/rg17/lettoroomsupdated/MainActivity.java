package com.rg17.lettoroomsupdated;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_mainotp,btn_mainnext;
    TextView tag,resend;
    EditText mph,motp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_mainotp=(Button)findViewById(R.id.otp_btn);
        btn_mainnext=(Button)findViewById(R.id.submitotp_btn);
        tag=findViewById(R.id.tagline);
        resend=findViewById(R.id.resendOtp);
        mph=findViewById(R.id.phno);
        motp=findViewById(R.id.otp);

        btn_mainotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_mainotp.setVisibility(View.GONE);
                btn_mainnext.setVisibility(View.VISIBLE);
                mph.setVisibility(View.GONE);
                motp.setVisibility(View.VISIBLE);
                resend.setVisibility(View.VISIBLE);

            }
        });
        btn_mainnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LandlordOrTenant.class);
                startActivity(intent);
            }
        });
        resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_mainotp.setVisibility(View.VISIBLE);
                btn_mainnext.setVisibility(View.GONE);
                mph.setVisibility(View.VISIBLE);
                motp.setVisibility(View.GONE);
                resend.setVisibility(View.GONE);
                btn_mainotp.setBackgroundResource(R.drawable.button_next);
            }
        });
    }

}

