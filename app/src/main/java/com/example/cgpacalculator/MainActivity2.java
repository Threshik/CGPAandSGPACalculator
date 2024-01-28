package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
/*DBHelper dbHelper = new DBHelper(this);
Button b1;
EditText regno,dept,year;*/

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
        /*b1 = findViewById(R.id.subtn);
        regno = findViewById(R.id.regno);
        dept = findViewById(R.id.depart);
        year = findViewById(R.id.year);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reg = regno.getText().toString();
                String dep = dept.getText().toString();
                String yr = year.getText().toString();
                Boolean checknametxt = dbHelper.insertuserdata(reg, dep, yr);
                if(reg.equals("")||dep.equals("")||yr.equals(""))
                {
                    Toast.makeText(MainActivity2.this, "Please fill the values", Toast.LENGTH_SHORT).show();
                }
                else if (checknametxt == true) {
                    Toast.makeText(MainActivity2.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                    *//*Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(intent);*//*
                } else {
                    Toast.makeText(MainActivity2.this, "Data already exists", Toast.LENGTH_SHORT).show();
                }


            }


        });



    }*/
