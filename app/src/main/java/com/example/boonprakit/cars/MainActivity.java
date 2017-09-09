package com.example.boonprakit.cars;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;
    Button search;
    Button remove;
    Button number1;
    Button number2;
    Button number3;
    Button number4;
    Button number5;
    Button number6;
    Button number7;
    Button number8;
    Button number9;
    Button number0;
    EditText query;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (Button)findViewById(R.id.action_search);
        container = (LinearLayout)findViewById(R.id.container);
        remove = (Button)findViewById(R.id.action_remove);
        number0 = (Button)findViewById(R.id.number0);
        number1 = (Button)findViewById(R.id.number1);
        number2 = (Button)findViewById(R.id.number2);
        number3 = (Button)findViewById(R.id.number3);
        number4 = (Button)findViewById(R.id.number4);
        number5 = (Button)findViewById(R.id.number5);
        number6 = (Button)findViewById(R.id.number6);
        number7 = (Button)findViewById(R.id.number7);
        number8 = (Button)findViewById(R.id.number8);
        number9 = (Button)findViewById(R.id.number9);
        query = (EditText)findViewById(R.id.query);

        search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    ArrayList<Car> searchResult = readExcelFile(MainActivity.this, "1ธนชาติ.xls", query.getText().toString());
                    if (searchResult.size() != 0) {

                        Intent i = new Intent(MainActivity.this, SearchResults.class);
                        i.putExtra("searchResult", searchResult);
                        startActivity(i);
                    } else {
                        Toast.makeText(MainActivity.this, "ไม่พบข้อมูล", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error : "+e.getMessage(), Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() > 0) {
                    query.setText(removeLastChar(text_query));
                }
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "1");
                }
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "2");
                }
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "3");
                }
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "4");
                }
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "5");
                }
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "6");
                }
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "7");
                }
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "8");
                }
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "9");
                }
            }
        });

        number0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text_query = query.getText().toString();
                if(text_query.length() < 4) {
                    query.setText(text_query + "0");
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.left_top) {
            container.setGravity(Gravity.LEFT | Gravity.TOP);
            return true;
        } else if (id == R.id.left_bottom) {
            container.setGravity(Gravity.LEFT | Gravity.BOTTOM);
            return true;
        } else if (id == R.id.right_top) {
            container.setGravity(Gravity.RIGHT | Gravity.TOP);
            return true;
        } else if (id == R.id.right_bottom) {
            container.setGravity(Gravity.RIGHT | Gravity.BOTTOM);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onResume()
    {  // After a pause OR at startup
        super.onResume();
        //Refresh your stuff here
        query.setText("");
    }

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }

    private static ArrayList<Car> readExcelFile(Context context, String filename, String query) {

        ArrayList<Car> carList = new ArrayList<>();
        if (!isExternalStorageAvailable() || isExternalStorageReadOnly())
        {
            Log.e("Error", "Storage not available or read only");

            return carList;
        }

        try{

            String baseDir = Environment.getExternalStorageDirectory().toString();
            File file = new File("/storage/MicroSD", filename);

            FileInputStream myInput = new FileInputStream(file);
            // Create a POIFSFileSystem object
            POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);

            // Create a workbook using the File System
            HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);

            // Get the first sheet from workbook
            HSSFSheet mySheet = myWorkBook.getSheetAt(0);

            /** We now need something to iterate through the cells.**/
            Iterator rowIter = mySheet.rowIterator();
            while(rowIter.hasNext()){
                HSSFRow myRow = (HSSFRow) rowIter.next();
                Iterator cellIter = myRow.cellIterator();
                int round = 1;
                String company = "";
                String brand = "";
                String color = "";
                String city = "";
                String charactor = "";
                String id = "";
                while(cellIter.hasNext()){
                    HSSFCell cell = (HSSFCell) cellIter.next();
                    if(round == 6) {
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_NUMERIC:
                                if(cell.getNumericCellValue() == Integer.valueOf(query)) {
                                    id = String.valueOf((int)cell.getNumericCellValue());
                                    Car obj = new Car(company, brand, color, city, charactor, id);
                                    carList.add(obj);
                                }
                                break;
                        }
                    } else if(round == 1) {
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_NUMERIC:
                                company = String.valueOf(cell.getNumericCellValue());
                                break;
                            case Cell.CELL_TYPE_STRING:
                                company = cell.getStringCellValue();
                                break;
                        }

                    } else if(round == 2) {
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_NUMERIC:
                                brand = String.valueOf(cell.getNumericCellValue());
                                break;
                            case Cell.CELL_TYPE_STRING:
                                brand = cell.getStringCellValue();
                                break;
                        }
                    } else if(round == 3) {
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_NUMERIC:
                                color = String.valueOf(cell.getNumericCellValue());
                                break;
                            case Cell.CELL_TYPE_STRING:
                                color = cell.getStringCellValue();
                                break;
                        }
                    } else if(round == 4) {
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_NUMERIC:
                                city = String.valueOf(cell.getNumericCellValue());
                                break;
                            case Cell.CELL_TYPE_STRING:
                                city = cell.getStringCellValue();
                                break;
                        }
                    } else if(round == 5) {
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_NUMERIC:
                                charactor = String.valueOf(cell.getNumericCellValue());
                                break;
                            case Cell.CELL_TYPE_STRING:
                                charactor = cell.getStringCellValue();
                                break;
                        }
                    }
                    round++;
                }
            }
        }catch (Exception e){
            Toast.makeText(context, "Error : "+e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
        return carList;
    }

    public static boolean isExternalStorageReadOnly() {
        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(extStorageState)) {
            return true;
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(extStorageState)) {
            return true;
        }
        return false;
    }


}




