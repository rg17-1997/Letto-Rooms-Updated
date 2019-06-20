package com.rg17.lettoroomsupdated;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LandlordDetails extends AppCompatActivity {

    private int btnmale=1,btnfemale=1,btnother=1;
    Button btnnext;
    EditText firstname,lastname,landlord_email;
    TextView gendermale,genderfemale,genderother;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_details);

        btnnext= (Button)findViewById(R.id.landlordcontinue_btn);
        landlord_email=(EditText) findViewById(R.id.email_id);
        firstname=(EditText) findViewById(R.id.first_name);
        lastname=(EditText) findViewById(R.id.last_name);
        genderfemale=(TextView) findViewById(R.id.gender_female);
        gendermale=(TextView) findViewById(R.id.gender_male);
        genderother=(TextView) findViewById(R.id.gender_other);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LandlordDetails.this, FlatPgHostel.class);
                startActivity(intent);
            }
        });


            gendermale.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(btnmale%2==1) {
                        gendermale.setBackgroundResource(R.drawable.round_button);
                    }
                    else {
                        gendermale.setBackgroundResource(R.drawable.background);
                    }
                    btnmale++;
                    genderfemale.setBackgroundResource(R.drawable.background);
                    genderother.setBackgroundResource(R.drawable.background);

                }
            });

            genderfemale.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(btnfemale%2==1) {
                        genderfemale.setBackgroundResource(R.drawable.round_button);
                    }
                    else {
                        genderfemale.setBackgroundResource(R.drawable.background);
                    }
                    btnfemale++;
                    gendermale.setBackgroundResource(R.drawable.background);
                    genderother.setBackgroundResource(R.drawable.background);
                }
            });

            genderother.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(btnother%2==1) {
                        genderother.setBackgroundResource(R.drawable.round_button);
                    }
                    else {
                        genderother.setBackgroundResource(R.drawable.background);
                    }
                    btnother++;
                    genderfemale.setBackgroundResource(R.drawable.background);
                    gendermale.setBackgroundResource(R.drawable.background);

                }
            });


    }
}
