package com.example.barcode_projact;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class nextActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        String test_name = intent.getStringExtra("test_name");
        String test_number = intent.getStringExtra("test_number");
        String test_job = intent.getStringExtra("test_job");
        int test_class = intent.getIntExtra("test_class", 0);
        double test_point = intent.getDoubleExtra("test_point", 0);

        TextView name = findViewById(R.id.tv_name);
        TextView number = findViewById(R.id.tv_number);
        TextView tv_class = findViewById(R.id.tv_class);
        TextView point = findViewById(R.id.tv_point);
        TextView job = findViewById(R.id.tv_job);

        name.setText(test_name);
        number.setText(test_number);
        job.setText(test_job);
        tv_class.setText(test_class+""); // 숫자는 항상 빈 칸이랑 같이 연결시켜줘야 에러가 안남
        point.setText((int) test_point+"");

        Button btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nextActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
