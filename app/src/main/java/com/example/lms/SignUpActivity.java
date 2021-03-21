package com.example.lms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {

    public ArrayList collegeList = new ArrayList<>();
    public ArrayList majorList = new ArrayList<>();
    Spinner spn_college;
    Spinner spn_major;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        spn_college = (Spinner)findViewById(R.id.spn_college);
        spn_major = (Spinner)findViewById(R.id.spn_major);
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
        spn_college.setAdapter(collegeArrayAdapter);
        ArrayAdapter majorArrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,majorList);
        spn_major.setAdapter(majorArrayAdapter);


    }
}