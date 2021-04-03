package com.example.lms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {

    public ArrayList collegeList = new ArrayList<>();
    public ArrayList majorList = new ArrayList<>();
    private Spinner spn_college;
    private Spinner spn_major;
    private Button btn_cancel;
    private Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        spn_college = (Spinner)findViewById(R.id.spn_college);
        spn_major = (Spinner)findViewById(R.id.spn_major);
        btn_ok = (Button)findViewById(R.id.btn_ok);
        btn_cancel = (Button)findViewById(R.id.btn_cancel);
        collegeList.add("경영대학");
        collegeList.add("ICT융합대학");
        collegeList.add("법과대학");
        collegeList.add("인문대학");
        collegeList.add("사회과학대학");
        majorList.add("융합소프트웨어학부");
        majorList.add("디지털콘텐츠미디어학과");
        majorList.add("경영학과");
        majorList.add("국어국문학과");
        majorList.add("중어중문학과");
        ArrayAdapter collegeArrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,collegeList);
        ArrayAdapter majorArrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,majorList);
        spn_college.setAdapter(collegeArrayAdapter);
        spn_major.setAdapter(majorArrayAdapter);
        btn_ok.setOnClickListener(okListener);
        btn_cancel.setOnClickListener(cancelListener);
    }

    View.OnClickListener okListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    View.OnClickListener cancelListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };
}