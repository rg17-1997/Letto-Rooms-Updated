package com.rg17.lettoroomsupdated;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Location extends AppCompatActivity {

    Button btn_nextlocation;
    EditText mhouse,mstreet,mlocation,mcity,mpincode,mlandmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        btn_nextlocation=(Button) findViewById(R.id.location_btn);
        mhouse=(EditText) findViewById(R.id.house);
        mstreet=(EditText) findViewById(R.id.street);
        mlocation=(EditText) findViewById(R.id.location);
        mcity=(EditText) findViewById(R.id.city);
        mpincode=(EditText) findViewById(R.id.pincode);
        mlandmark=(EditText) findViewById(R.id.landmark);
        btn_nextlocation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Location.this, ExtraDetails.class);
                startActivity(intent);
            }
        });
    }
}
