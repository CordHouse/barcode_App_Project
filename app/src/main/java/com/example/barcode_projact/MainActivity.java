package com.example.barcode_projact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_start = findViewById(R.id.btn_start);
        EditText name = findViewById(R.id.et_name);
        EditText number = findViewById(R.id.et_number);
        EditText et_class = findViewById(R.id.et_class);
        EditText point = findViewById(R.id.et_point);
        EditText job = findViewById(R.id.et_job);


        btn_start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String test_name = name.getText().toString();
                String test_number = number.getText().toString();
                String test_job = job.getText().toString();
                int test_class = Integer.parseInt(et_class.getText().toString());
                double test_point = Double.parseDouble(point.getText().toString());
                Intent intent = new Intent(MainActivity.this, nextActivity.class);
                intent.putExtra("test_name", test_name);
                intent.putExtra("test_number", test_number);
                intent.putExtra("test_job", test_job);
                intent.putExtra("test_class", test_class);
                intent.putExtra("test_point", test_point);
                startActivity(intent);
            }
        });
    }
}