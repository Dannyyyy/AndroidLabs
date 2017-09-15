package com.example.danil.androidlabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Intent intent = getIntent();

        String inputValue = intent.getStringExtra("second_activity_input_value");

        Button gotoBtn = (Button) findViewById(R.id.go_to_second_activity_btn);
        gotoBtn.setOnClickListener(onClickListener);

        editText = (EditText) findViewById(R.id.first_activity_edit_text);
        if(inputValue != null) {
            editText.setText(inputValue);
        }
    }

    @Override
    public void onBackPressed() {
        gotoSecondActivity();

        super.onBackPressed();
    }

    public void gotoSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("first_activity_input_value", editText.getText().toString());
        startActivity(intent);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gotoSecondActivity();
        }
    };
}
