package com.example.lms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button btn_login;
    private EditText et_id;
    private EditText et_password;
    private TextView tv_findId;
    private TextView tv_findPassword;
    private TextView tv_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        et_id = findViewById(R.id.et_id);
        et_password = findViewById(R.id.et_password);
        tv_findId = findViewById(R.id.tv_findId);
        tv_findPassword = findViewById(R.id.tv_findPassword);
        tv_signUp = findViewById(R.id.tv_sinUp);

        btn_login.setOnClickListener(loginListener);
        tv_signUp.setOnClickListener(signUpListener);
    }

    View.OnClickListener loginListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    View.OnClickListener signUpListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    };
}