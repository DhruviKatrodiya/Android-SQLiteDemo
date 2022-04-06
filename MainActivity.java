package com.example.assignment2q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    dbhelper obj = new dbhelper(this,null,null,1);
    EditText en,eds,ec,edoj;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //obj.addData();
        en = findViewById(R.id.e1);
        eds = findViewById(R.id.e2);
        ec = findViewById(R.id.e3);
        edoj = findViewById(R.id.e4);
        btn = findViewById(R.id.b1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obj.addData( en.getText().toString(),eds.getText().toString(),ec.getText().toString(),edoj.getText().toString() );
            }
        });
    }
}