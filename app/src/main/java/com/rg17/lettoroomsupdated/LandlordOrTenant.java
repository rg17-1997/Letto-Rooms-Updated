package com.rg17.lettoroomsupdated;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandlordOrTenant extends AppCompatActivity {

    Button mbtn_land,mbtn_tenant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_or_tenant);

        mbtn_land=findViewById(R.id.btn_landord);
        mbtn_tenant=findViewById(R.id.btn_tenant);

        mbtn_land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LandlordOrTenant.this, LandlordDetails.class);
                startActivity(intent);
            }
        });
    }
}
