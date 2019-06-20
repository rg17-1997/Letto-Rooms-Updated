package com.rg17.lettoroomsupdated;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.collection.LLRBNode;

public class FlatPgHostel extends AppCompatActivity {

    Button mflat_btn,mpg_btn,mhostel_btn,mnext_btn,msharing,mrooms,mmeal,mupload;
    TextView one_bhk,two_bhk,three_bhk,four_bhk;
    ImageView mbed,mwardrobe,mtable_chairs,mwashing_machine,mkitchen,mfan,mfridge,mgeyser,mac,mparking,mbalcony,mgarden,mpets,msecurity,madd;
    LinearLayout hostelpglayout,flatlayout;
    int bhk1state=1,bhk2state=1,bhk3state=1,bhk4state=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_pg_hostel);

        mflat_btn=(Button)findViewById(R.id.btnflat);
        mhostel_btn=(Button)findViewById(R.id.btnhostel);
        mpg_btn=(Button) findViewById(R.id.btnpg);
        mnext_btn=(Button)findViewById(R.id.pghostelflatnext_btn);
        hostelpglayout=(LinearLayout) findViewById(R.id.pghostelbuttons);
        flatlayout=(LinearLayout) findViewById(R.id.flatbhk);
        mbed=(ImageView) findViewById(R.id.bed);
        mwardrobe=(ImageView) findViewById(R.id.wardrobe);
        mtable_chairs=(ImageView) findViewById(R.id.table);
        mwashing_machine=(ImageView) findViewById(R.id.washingmachine);
        mkitchen=(ImageView) findViewById(R.id.kitchen);
        mfan=(ImageView) findViewById(R.id.fan);
        mfridge=(ImageView) findViewById(R.id.fridge);
        mgeyser=(ImageView) findViewById(R.id.geyser);
        mac=(ImageView) findViewById(R.id.ac);
        mparking=(ImageView) findViewById(R.id.parking);
        mbalcony=(ImageView) findViewById(R.id.balcony);
        mgarden=(ImageView) findViewById(R.id.garden);
        mpets=(ImageView) findViewById(R.id.pets);
        msecurity=(ImageView) findViewById(R.id.security);
        madd=(ImageView) findViewById(R.id.addmore);
        one_bhk=(TextView) findViewById(R.id.bhk1);
        two_bhk=(TextView) findViewById(R.id.bhk2);
        three_bhk=(TextView) findViewById(R.id.bhk3);
        four_bhk=(TextView) findViewById(R.id.bhk4);
        msharing=(Button)findViewById(R.id.btnhostelpg_sharing);
        mrooms=(Button) findViewById(R.id.btnhostelpg_rooms);
        mmeal=(Button) findViewById(R.id.btnhostelpg_meal);
        mupload=(Button) findViewById(R.id.upload_photo);

        mflat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               hostelpglayout.setVisibility(View.GONE);
               flatlayout.setVisibility(View.VISIBLE);
               mflat_btn.setBackgroundResource(R.drawable.round_button2);
               mhostel_btn.setBackgroundResource(R.drawable.round_button);
               mpg_btn.setBackgroundResource(R.drawable.round_button);
            }
        });

        mpg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hostelpglayout.setVisibility(View.VISIBLE);
                flatlayout.setVisibility(View.GONE);
                mflat_btn.setBackgroundResource(R.drawable.round_button);
                mhostel_btn.setBackgroundResource(R.drawable.round_button);
                mpg_btn.setBackgroundResource(R.drawable.round_button2);
            }
        });

        mhostel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hostelpglayout.setVisibility(View.VISIBLE);
                flatlayout.setVisibility(View.GONE);
                mflat_btn.setBackgroundResource(R.drawable.round_button);
                mhostel_btn.setBackgroundResource(R.drawable.round_button2);
                mpg_btn.setBackgroundResource(R.drawable.round_button);
            }
        });

        mnext_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FlatPgHostel.this,Location.class);
                startActivity(intent);
            }
        });

        one_bhk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bhk1state%2==1)
                {
                    one_bhk.setBackgroundResource(R.drawable.round_button);
                }
                else
                {
                    one_bhk.setBackgroundResource(R.drawable.background);
                }
                bhk1state++;
            }
        });

        two_bhk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bhk2state%2==1)
                {
                    two_bhk.setBackgroundResource(R.drawable.round_button);
                }
                else
                {
                    two_bhk.setBackgroundResource(R.drawable.background);
                }
                bhk2state++;
            }
        });

        three_bhk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bhk3state%2==1)
                {
                    three_bhk.setBackgroundResource(R.drawable.round_button);
                }
                else
                {
                    three_bhk.setBackgroundResource(R.drawable.background);
                }
                bhk3state++;
            }
        });

        four_bhk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bhk4state%2==1)
                {
                    four_bhk.setBackgroundResource(R.drawable.round_button);
                }
                else
                {
                    four_bhk.setBackgroundResource(R.drawable.background);
                }
                bhk4state++;
            }
        });





    }
}
