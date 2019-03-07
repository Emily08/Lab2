package com.example.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CreateUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
    }

        EditText text = findViewById(R.id.username);

        boolean male = true;

        public void onClick(View view) {
            EditText input = (EditText) findViewById(R.id.username);
            String string = input.getText().toString();

            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gender);
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.male:
                            male = true;
                            break;
                        case R.id.female:
                            male = false;
                            break;
                    }
                }
            });

            if (male) {
                Toast.makeText(this, "User " + string + " created is male.", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "User " + string + " created is female.", Toast.LENGTH_LONG).show();
            }
        }

// more code



    }
}
