package com.rg17.lettoroomsupdated;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pricing extends AppCompatActivity {

    EditText sharing1,sharing2,sharing3;
    TextView melec_inc,melec_exc,monline,moffline;
    Button btn_finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricing);

        sharing1=(EditText) findViewById(R.id.single_price);
        sharing2=(EditText) findViewById(R.id.double_price);
        sharing3=(EditText) findViewById(R.id.triple_price);
        melec_inc=(TextView) findViewById(R.id.electricity_included);
        melec_exc=(TextView) findViewById(R.id.electricity_excluded);
        monline=(TextView) findViewById(R.id.payment_online);
        moffline=(TextView) findViewById(R.id.payment_offline);
        btn_finish=(Button) findViewById(R.id.finish_btn);

        melec_exc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                melec_exc.setBackgroundResource(R.drawable.round_button);
                melec_inc.setBackgroundResource(R.drawable.background);
            }
        });

        melec_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                melec_exc.setBackgroundResource(R.drawable.background);
                melec_inc.setBackgroundResource(R.drawable.round_button);
            }
        });

        monline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monline.setBackgroundResource(R.drawable.round_button);
                moffline.setBackgroundResource(R.drawable.background);
            }
        });

        moffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monline.setBackgroundResource(R.drawable.background);
                moffline.setBackgroundResource(R.drawable.round_button);
            }
        });
    }
}
