package com.example.toshiba.myapplication;


import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    private RadioGroup radioGroup6;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private int count;
    private EditText edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        addListenerOnButton();
        checkBox1.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
        checkBox3.setOnClickListener(this);
        checkBox4.setOnClickListener(this);
        edit = (EditText) findViewById(R.id.textvalue11);

    }


    public void text(View view) {

        String Text = edit.getText().toString();

        if (Text.equals("1971")) {
            count = count+1;
            Toast.makeText(getApplicationContext(), "Answer: Correct",
                    Toast.LENGTH_SHORT).show();

        } else {
            count = count;
        }

    }
    @OnClick(R.id.Submit)
    public void submit() {


        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        dlgAlert.setMessage("You got "+ count +"/8 correct!! ");
        if (count < 5){
            dlgAlert.setTitle("Try again!!");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();}
        else if (count > 5 ) {
            dlgAlert.setTitle("Nice job!!");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();}

        radioGroup1.clearCheck();
        radioGroup2.clearCheck();

        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();

        edit.setText("");
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox4.setChecked(false);
        count = 0;

    }

    public void addListenerOnButton() {

        radioGroup1 = (RadioGroup) findViewById(R.id.Group_button1);
        radioGroup2 = (RadioGroup) findViewById(R.id.Group_button2);
        radioGroup3 = (RadioGroup) findViewById(R.id.Group_button3);
        radioGroup4 = (RadioGroup) findViewById(R.id.Group_button4);
        radioGroup5 = (RadioGroup) findViewById(R.id.Group_button5);
        radioGroup6 = (RadioGroup) findViewById(R.id.Group_button6);
        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkbox4);


        radioGroup1.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.Group1_radio_button2) {
                    count = count+1;
                    Toast.makeText(getApplicationContext(), "Answer: Correct",
                            Toast.LENGTH_SHORT).show();
                } else {
                    count = count;
                }
            }

        });
        radioGroup2.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.Group2_radio_button3) {
                    count = count+1;
                    Toast.makeText(getApplicationContext(), "Answer: Correct",
                            Toast.LENGTH_SHORT).show();
                } else {
                    count = count;
                }
            }

        });
        radioGroup3.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.Group3_radio_button2) {
                    count = count+1;
                    Toast.makeText(getApplicationContext(), "Answer: Correct",
                            Toast.LENGTH_SHORT).show();
                } else {
                    count = count;
                }
            }

        });
        radioGroup4.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.Group4_radio_button3) {
                    count = count+1;
                    Toast.makeText(getApplicationContext(), "Answer: Correct",
                            Toast.LENGTH_SHORT).show();
                } else {
                    count = count;
                }
            }

        });
        radioGroup5.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.Group5_radio_button4) {
                    count = count + 1;
                    Toast.makeText(getApplicationContext(), "Answer: Correct",
                            Toast.LENGTH_SHORT).show();
                } else {
                    count = count;
                }
            }

        });
        radioGroup6.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.Group6_radio_button2) {
                    count = count + 1;
                    Toast.makeText(getApplicationContext(), "Answer: Correct",
                            Toast.LENGTH_SHORT).show();
                } else {
                    count = count;
                }
            }

        });

    }


    @Override
    public void onClick(View v) {

        if (checkBox1.isChecked() && checkBox2.isChecked()) {
            count = count + 1;
            Toast.makeText(getApplicationContext(), "Answer: Correct",
                    Toast.LENGTH_SHORT).show();
        } else {
            count = count;
        }

    }






}