package com.example.boonprakit.cars;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boonprakit on 3/9/2560.
 */

public class SearchResults extends AppCompatActivity {
    Button back;
    DBHelper mHelper;
    TextView result1, result2, result3, result4, result5, result6, result7, result8, result9,
            result10, result11, result12, result13, result14, result15, result16, result17, result18 ,
            result19, result20, result21, result22, result23, result24, result25, result26, result27,
            result28, result29, result30, result31, result32;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_results);
        final String query = (String) getIntent().getSerializableExtra("query");
        mHelper = new DBHelper(this);
        final List<String> IDs =  mHelper.getListID(query);
        setTitle("ผลการค้นหา " + IDs.size() + " เร็คคอร์ด");

        result1 = (TextView)findViewById(R.id.result1);
        result2 = (TextView)findViewById(R.id.result2);
        result3 = (TextView)findViewById(R.id.result3);
        result4 = (TextView)findViewById(R.id.result4);
        result5 = (TextView)findViewById(R.id.result5);
        result6 = (TextView)findViewById(R.id.result6);
        result7 = (TextView)findViewById(R.id.result7);
        result8 = (TextView)findViewById(R.id.result8);
        result9 = (TextView)findViewById(R.id.result9);
        result10 = (TextView)findViewById(R.id.result10);
        result11 = (TextView)findViewById(R.id.result11);
        result12 = (TextView)findViewById(R.id.result12);
        result13 = (TextView)findViewById(R.id.result13);
        result14 = (TextView)findViewById(R.id.result14);
        result15 = (TextView)findViewById(R.id.result15);
        result16 = (TextView)findViewById(R.id.result16);

        result17 = (TextView)findViewById(R.id.result17);
        result18 = (TextView)findViewById(R.id.result18);
        result19 = (TextView)findViewById(R.id.result19);
        result20 = (TextView)findViewById(R.id.result20);
        result21 = (TextView)findViewById(R.id.result21);
        result22 = (TextView)findViewById(R.id.result22);
        result23 = (TextView)findViewById(R.id.result23);
        result24 = (TextView)findViewById(R.id.result24);
        result25 = (TextView)findViewById(R.id.result25);
        result26 = (TextView)findViewById(R.id.result26);
        result27 = (TextView)findViewById(R.id.result27);
        result28 = (TextView)findViewById(R.id.result28);
        result29 = (TextView)findViewById(R.id.result29);
        result30 = (TextView)findViewById(R.id.result30);
        result31 = (TextView)findViewById(R.id.result31);
        result32 = (TextView)findViewById(R.id.result32);

        result1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result1.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(0));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result2.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(1));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result3.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(2));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result4.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(3));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result5.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(4));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result6.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(5));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result7.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(6));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result8.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(7));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result9.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(8));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result10.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(9));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result11.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(10));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result12.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(11));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result13.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(12));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result14.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(13));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result15.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(14));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result16.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(15));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result17.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(16));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result18.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(17));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result19.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(18));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result20.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(19));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result21.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(20));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result22.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(21));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result23.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(22));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result24.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(23));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result25.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(24));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result26.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(25));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result27.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(26));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result28.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(27));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result29.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(28));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result30.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(29));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result31.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(30));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        result32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result32.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("id", IDs.get(31));
                    i.putExtra("query", query);
                    startActivity(i);
                }
            }
        });

        for(int i=0;i<IDs.size();i++){
            // print member of our arraylist one by one
            String id = IDs.get(i);
            if(i==0)
                result1.setText(id);
            else if(i==1)
                result2.setText(id);
            else if(i==2)
                result3.setText(id);
            else if(i==3)
                result4.setText(id);
            else if(i==4)
                result5.setText(id);
            else if(i==5)
                result6.setText(id);
            else if(i==6)
                result7.setText(id);
            else if(i==7)
                result8.setText(id);
            else if(i==8)
                result9.setText(id);
            else if(i==9)
                result10.setText(id);
            else if(i==10)
                result11.setText(id);
            else if(i==11)
                result12.setText(id);
            else if(i==12)
                result13.setText(id);
            else if(i==13)
                result14.setText(id);
            else if(i==14)
                result15.setText(id);
            else if(i==15)
                result16.setText(id);
            else if(i==16)
                result17.setText(id);
            else if(i==17)
                result18.setText(id);
            else if(i==18)
                result19.setText(id);
            else if(i==19)
                result20.setText(id);
            else if(i==20)
                result21.setText(id);
            else if(i==21)
                result22.setText(id);
            else if(i==22)
                result23.setText(id);
            else if(i==23)
                result24.setText(id);
            else if(i==24)
                result25.setText(id);
            else if(i==25)
                result26.setText(id);
            else if(i==26)
                result27.setText(id);
            else if(i==27)
                result28.setText(id);
            else if(i==28)
                result29.setText(id);
            else if(i==29)
                result30.setText(id);
            else if(i==30)
                result31.setText(id);
            else if(i==31)
                result32.setText(id);
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

