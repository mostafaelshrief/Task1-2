package com.example.task1.Data_Refrance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.task1.R;

import java.util.ArrayList;

public class Main_Activity extends AppCompatActivity {
    Pojo array= new Pojo();
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);
        mTextView=findViewById(R.id.name_TExtView);
        //todo ?? one string to carry all strings
        String content = "" ;
        //todo ?? make for loop to concatenate strings in one string
        for (int i = 0; i <array.myNumbers().size() ; i++) {
            //todo ?? take object for each element in array
            Class_model class_model = array.myNumbers().get(i) ;
            //todo ?? concatenate Strings
            content += "\n" + class_model.getId() +"_"+class_model.getName() ;
        }
        //todo ?? set whole string in text view
        mTextView.setText(content);
    }
       
}
