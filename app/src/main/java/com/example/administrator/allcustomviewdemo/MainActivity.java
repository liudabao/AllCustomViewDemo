package com.example.administrator.allcustomviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {

    BasicView view;
    //Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        //btn=(Button)findViewById(R.id.button);
        view =(BasicView)findViewById(R.id.view);

    }

}
