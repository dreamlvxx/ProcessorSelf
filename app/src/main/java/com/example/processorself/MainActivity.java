package com.example.processorself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.apt_annotation.Router;

@Router({"111","222"})
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
