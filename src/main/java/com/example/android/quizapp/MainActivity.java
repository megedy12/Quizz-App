package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * @param view
     */
    public void submitAnswers(View view) {
        int counter = 0;
        String logging = "Q number ";

        CheckBox CC_checkBox = (CheckBox) findViewById(R.id.Q1_CC_checkbox);
        CheckBox L_checkBox = (CheckBox) findViewById(R.id.Q1_L_checkbox);
        CheckBox Hp_checkBox = (CheckBox) findViewById(R.id.Q2_hp_checkbox);
        CheckBox Kw_checkBox = (CheckBox) findViewById(R.id.Q2_kw_checkbox);

        if (CC_checkBox.isChecked() && L_checkBox.isChecked()) {

            counter++; // 1st Q is right
            Log.v("mainactivity", logging + "1 is correct");

        }

        if (Hp_checkBox.isChecked() && Kw_checkBox.isChecked()) {

            counter++; // 2nd Q is right
            Log.v("mainactivity", logging + "2 is correct");
        }

        RadioButton Q3_radioButton = (RadioButton) findViewById(R.id.Q3_radio_button);
        if (Q3_radioButton.isChecked()) {
            counter++;// 3rd Q is right
            Log.v("mainactivity", logging + "3 is correct");
        }

        RadioButton Q4_radioButton = (RadioButton) findViewById(R.id.Q4_radio_button);
        if (Q4_radioButton.isChecked()) {
            counter++; // 4th Q is right
            Log.v("mainactivity", logging + "4 is correct");
        }

        RadioButton Q5_radioButton = (RadioButton) findViewById(R.id.Q5_radio_button);
        if (Q5_radioButton.isChecked()) {
            counter++;// 5th Q is right
            Log.v("mainactivity", logging + "5 is correct");
        }
        RadioButton Q6_radioButton = (RadioButton) findViewById(R.id.Q6_radio_button);
        if (Q6_radioButton.isChecked()) {
            counter++;// 6th Q is right
            Log.v("mainactivity", logging + "6 is correct");
        }
        RadioButton Q7_radioButton = (RadioButton) findViewById(R.id.Q7_radio_button);
        if (Q7_radioButton.isChecked()) {
            counter++;// 7th Q is right
            Log.v("mainactivity", logging + "7 is correct");
        }

        Context context = getApplicationContext();
        CharSequence text = "You got " + counter + "/7 correct answers.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        return;


    }
}
