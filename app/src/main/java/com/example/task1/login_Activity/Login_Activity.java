package com.example.task1.login_Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.task1.Data_Refrance.Main_Activity;
import com.example.task1.R;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener {
    EditText mUsername,mUserpass;
    Button mNextBtn,mSubmitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiViews();
    }

    private void intiViews() {
        mUsername=findViewById(R.id.user_name);
        mUserpass=findViewById(R.id.user_pass);
        mNextBtn=findViewById(R.id.next_btn);
        mSubmitBtn=findViewById(R.id.submit_btn);
        mNextBtn.setOnClickListener(this);
        mSubmitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.submit_btn:
                if (!(mUsername.getText().toString().equalsIgnoreCase("mostafa@gmail.com"))) {
                    Toast.makeText(Login_Activity.this, "please check your username", Toast.LENGTH_LONG).show();
                }
                else if ((mUsername.getText().toString().isEmpty())){
                    Toast.makeText(Login_Activity.this, "please don't leave any field empty", Toast.LENGTH_LONG).show();
                }
                else if ((mUserpass.getText().toString().isEmpty())) {
                    Toast.makeText(Login_Activity.this, "please don't leave any field empty", Toast.LENGTH_LONG).show();
                }
                else if (!(mUserpass.getText().toString().equalsIgnoreCase("123456789"))) {
                    Toast.makeText(Login_Activity.this, "please check your password", Toast.LENGTH_SHORT).show();
                }
                else{
                if (mUsername.getText().toString().equalsIgnoreCase("mostafa@gmail.com")&&
                    (mUserpass.getText().toString().equalsIgnoreCase("123456789")));
                    Toast.makeText(Login_Activity.this, "welcom", Toast.LENGTH_LONG).show();
                }
                 break;
            case R.id.next_btn:
                Intent i = new Intent(Login_Activity.this, Main_Activity.class);
                startActivity(i);
            }


        }

    }
