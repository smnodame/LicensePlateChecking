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
    TextView description;
    Button back;
    DBHelper mHelper;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        description = (TextView)findViewById(R.id.description);
        final String id = (String) getIntent().getSerializableExtra("id");
        final String query = (String) getIntent().getSerializableExtra("query");
        mHelper = new DBHelper(this);
        description.setText(mHelper.getDetail(id, query));
        setTitle("รายละเอียด " + id);

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

