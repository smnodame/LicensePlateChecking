package com.example.boonprakit.cars;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by boonprakit on 3/9/2560.
 */

public class Detail extends AppCompatActivity {
    TextView company;
    TextView color;
    TextView brand;
    Button back;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        company = (TextView)findViewById(R.id.company);
        brand = (TextView)findViewById(R.id.brand);
        color = (TextView)findViewById(R.id.color);
        final Car detail = (Car) getIntent().getSerializableExtra("detail");
        setTitle("รายละเอียด " + detail.charactor + "-" + detail.id + "-" + detail.city);
        if(detail.company != "") {
            company.setText(detail.company);
        }

        if(detail.brand != "") {
            brand.setText(detail.brand);
        }

        if(detail.color != "") {
            color.setText(detail.color);
        }

        back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    onBackPressed();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}

