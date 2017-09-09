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

/**
 * Created by boonprakit on 3/9/2560.
 */

public class SearchResults extends AppCompatActivity {
    Button back;
    TextView result1, result2, result3, result4, result5, result6, result7, result8, result9,
            result10, result11, result12, result13, result14, result15, result16, result17, result18 ,
            result19, result20, result21, result22, result23, result24, result25, result26, result27,
            result28, result29, result30, result31, result32;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_results);
        final ArrayList<Car> searchResult = (ArrayList<Car>) getIntent().getSerializableExtra("searchResult");
        setTitle("ผลการค้นหา " + searchResult.size() + " เร็คคอร์ด");

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
                    i.putExtra("detail", searchResult.get(0));
                    startActivity(i);
                }
            }
        });

        result2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result2.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(1));
                    startActivity(i);
                }
            }
        });

        result3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result3.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(2));
                    startActivity(i);
                }
            }
        });

        result4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result4.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(3));
                    startActivity(i);
                }
            }
        });

        result5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result5.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(4));
                    startActivity(i);
                }
            }
        });

        result6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result6.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(5));
                    startActivity(i);
                }
            }
        });

        result7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result7.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(6));
                    startActivity(i);
                }
            }
        });

        result8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result8.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(7));
                    startActivity(i);
                }
            }
        });

        result9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result9.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(8));
                    startActivity(i);
                }
            }
        });

        result10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result10.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(9));
                    startActivity(i);
                }
            }
        });

        result11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result11.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(10));
                    startActivity(i);
                }
            }
        });

        result12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result12.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(11));
                    startActivity(i);
                }
            }
        });

        result13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result13.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(12));
                    startActivity(i);
                }
            }
        });

        result14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result14.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(13));
                    startActivity(i);
                }
            }
        });

        result15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result15.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(14));
                    startActivity(i);
                }
            }
        });

        result16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result16.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(15));
                    startActivity(i);
                }
            }
        });

        result17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result17.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(16));
                    startActivity(i);
                }
            }
        });

        result18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result18.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(17));
                    startActivity(i);
                }
            }
        });

        result19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result19.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(18));
                    startActivity(i);
                }
            }
        });

        result20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result20.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(19));
                    startActivity(i);
                }
            }
        });

        result21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result21.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(20));
                    startActivity(i);
                }
            }
        });

        result22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result22.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(21));
                    startActivity(i);
                }
            }
        });

        result23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result23.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(22));
                    startActivity(i);
                }
            }
        });

        result24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result24.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(23));
                    startActivity(i);
                }
            }
        });

        result25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result25.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(24));
                    startActivity(i);
                }
            }
        });

        result26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result26.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(25));
                    startActivity(i);
                }
            }
        });

        result27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result27.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(26));
                    startActivity(i);
                }
            }
        });

        result28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result28.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(27));
                    startActivity(i);
                }
            }
        });

        result29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result29.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(28));
                    startActivity(i);
                }
            }
        });

        result30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result30.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(29));
                    startActivity(i);
                }
            }
        });

        result31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result31.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(30));
                    startActivity(i);
                }
            }
        });

        result32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(result32.getText() != "") {
                    Intent i = new Intent(SearchResults.this, Detail.class);
                    i.putExtra("detail", searchResult.get(31));
                    startActivity(i);
                }
            }
        });

        for(int i=0;i<searchResult.size();i++){
            // print member of our arraylist one by one
            String company = searchResult.get(i).company;
            String brand = searchResult.get(i).brand;
            String color = searchResult.get(i).color;
            String city = searchResult.get(i).city;
            String charactor = searchResult.get(i).charactor;
            String id = searchResult.get(i).id;
            if(i==0)
                result1.setText(charactor + "-" + id + "-" + city);
            else if(i==1)
                result2.setText(charactor + "-" + id + "-" + city);
            else if(i==2)
                result3.setText(charactor + "-" + id + "-" + city);
            else if(i==3)
                result4.setText(charactor + "-" + id + "-" + city);
            else if(i==4)
                result5.setText(charactor + "-" + id + "-" + city);
            else if(i==5)
                result6.setText(charactor + "-" + id + "-" + city);
            else if(i==6)
                result7.setText(charactor + "-" + id + "-" + city);
            else if(i==7)
                result8.setText(charactor + "-" + id + "-" + city);
            else if(i==8)
                result9.setText(charactor + "-" + id + "-" + city);
            else if(i==9)
                result10.setText(charactor + "-" + id + "-" + city);
            else if(i==10)
                result11.setText(charactor + "-" + id + "-" + city);
            else if(i==11)
                result12.setText(charactor + "-" + id + "-" + city);
            else if(i==12)
                result13.setText(charactor + "-" + id + "-" + city);
            else if(i==13)
                result14.setText(charactor + "-" + id + "-" + city);
            else if(i==14)
                result15.setText(charactor + "-" + id + "-" + city);
            else if(i==15)
                result16.setText(charactor + "-" + id + "-" + city);
            else if(i==16)
                result17.setText(charactor + "-" + id + "-" + city);
            else if(i==17)
                result18.setText(charactor + "-" + id + "-" + city);
            else if(i==18)
                result19.setText(charactor + "-" + id + "-" + city);
            else if(i==19)
                result20.setText(charactor + "-" + id + "-" + city);
            else if(i==20)
                result21.setText(charactor + "-" + id + "-" + city);
            else if(i==21)
                result22.setText(charactor + "-" + id + "-" + city);
            else if(i==22)
                result23.setText(charactor + "-" + id + "-" + city);
            else if(i==23)
                result24.setText(charactor + "-" + id + "-" + city);
            else if(i==24)
                result25.setText(charactor + "-" + id + "-" + city);
            else if(i==25)
                result26.setText(charactor + "-" + id + "-" + city);
            else if(i==26)
                result27.setText(charactor + "-" + id + "-" + city);
            else if(i==27)
                result28.setText(charactor + "-" + id + "-" + city);
            else if(i==28)
                result29.setText(charactor + "-" + id + "-" + city);
            else if(i==29)
                result30.setText(charactor + "-" + id + "-" + city);
            else if(i==30)
                result31.setText(charactor + "-" + id + "-" + city);
            else if(i==31)
                result32.setText(charactor + "-" + id + "-" + city);
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

