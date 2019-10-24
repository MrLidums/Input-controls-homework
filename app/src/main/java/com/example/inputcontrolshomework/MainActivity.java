package com.example.inputcontrolshomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private String cb1, cb2, cb3, cb4, cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showSelectedCheckboxes(View view) {

    }

    public void storeText(View view) {
        CheckBox checkBox = (CheckBox) findViewById(view.getId());
        switch (view.getId()){

        }
    }
}
