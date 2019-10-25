package com.example.inputcontrolshomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    private String cb1, cb2, cb3, cb4, cb5;
    private CheckBox[] checkBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxes = new CheckBox[5];
        checkBoxes = listAllCheckBoxes();
    }

    private CheckBox[] listAllCheckBoxes() {
        CheckBox[] allCheckBoxes = new CheckBox[5];
        allCheckBoxes[0] = findViewById(R.id.checkBox1);
        allCheckBoxes[1] = findViewById(R.id.checkBox2);
        allCheckBoxes[2] = findViewById(R.id.checkBox3);
        allCheckBoxes[3] = findViewById(R.id.checkBox4);
        allCheckBoxes[4] = findViewById(R.id.checkBox5);
        return allCheckBoxes;
    }

    public void showSelectedCheckboxes(View view) {
        StringBuilder toastMessage = new StringBuilder("This is a toast message:");

        for (CheckBox cb:checkBoxes) {
            if (cb.isChecked()){
                toastMessage.append(" ").append(cb.getText().toString());
            }
        }
        Toast.makeText(this, toastMessage.toString(), Toast.LENGTH_SHORT).show();
    }
}
