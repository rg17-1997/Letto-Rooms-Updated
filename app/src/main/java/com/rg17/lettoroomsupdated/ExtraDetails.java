package com.rg17.lettoroomsupdated;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ExtraDetails extends AppCompatActivity {
    Button btn_nextextra;
    TextView mpref_family,mpref_student,mpref_any,mpref_male,mpref_female,mpref_both,gate_open,gate_close;
    EditText mmore_rules;
    CheckBox mvegetarian,mgender_friendly,msmoking_drinking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_details);
        btn_nextextra=(Button) findViewById(R.id.extradetails_btn);
        mpref_any=(TextView) findViewById(R.id.prefer_any);
        mpref_family=(TextView) findViewById(R.id.prefer_family);
        mpref_student=(TextView) findViewById(R.id.prefer_student);
        mpref_male=(TextView) findViewById(R.id.prefer_male);
        mpref_female=(TextView) findViewById(R.id.prefer_female);
        mpref_both=(TextView) findViewById(R.id.prefer_both);
        gate_close=(TextView) findViewById(R.id.close);
        gate_open=(TextView) findViewById(R.id.open);
        mmore_rules=(EditText) findViewById(R.id.more_rules);
        mvegetarian=(CheckBox) findViewById(R.id.nonveg);
        msmoking_drinking=(CheckBox) findViewById(R.id.smoking_drinking);
        mgender_friendly=(CheckBox) findViewById(R.id.gender_friendly);

        btn_nextextra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( ExtraDetails.this,Pricing.class);
                startActivity(intent);
            }
        });

        mpref_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpref_male.setBackgroundResource(R.drawable.round_button);
                mpref_female.setBackgroundResource(R.drawable.background);
                mpref_both.setBackgroundResource(R.drawable.background);
            }
        });

        mpref_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpref_female.setBackgroundResource(R.drawable.round_button);
                mpref_male.setBackgroundResource(R.drawable.background);
                mpref_both.setBackgroundResource(R.drawable.background);
            }
        });

        mpref_both.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpref_both.setBackgroundResource(R.drawable.round_button);
                mpref_female.setBackgroundResource(R.drawable.background);
                mpref_male.setBackgroundResource(R.drawable.background);
            }
        });

        mpref_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpref_student.setBackgroundResource(R.drawable.round_button);
                mpref_family.setBackgroundResource(R.drawable.background);
                mpref_any.setBackgroundResource(R.drawable.background);
            }
        });

        mpref_family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpref_family.setBackgroundResource(R.drawable.round_button);
                mpref_student.setBackgroundResource(R.drawable.background);
                mpref_any.setBackgroundResource(R.drawable.background);
            }
        });

        mpref_any.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpref_any.setBackgroundResource(R.drawable.round_button);
                mpref_family.setBackgroundResource(R.drawable.background);
                mpref_student.setBackgroundResource(R.drawable.background);
            }
        });
    }
}
