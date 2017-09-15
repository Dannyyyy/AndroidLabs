package com.example.danil.androidlabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String inputValue = intent.getStringExtra("first_activity_input_value");

        editText = (EditText) findViewById(R.id.second_activity_edit_text);
        editText.setText(inputValue);

        Button gotoBtn = (Button) findViewById(R.id.go_to_first_activity_btn);
        gotoBtn.setOnClickListener(onClickListener);
    }

    @Override
    public void onBackPressed() {
        gotoFirstActivity();

        super.onBackPressed();
    }

    public void gotoFirstActivity(){
        Intent intent = new Intent(this, FirstActivity.class);
        intent.putExtra("second_activity_input_value", editText.getText().toString());
        startActivity(intent);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gotoFirstActivity();
        }
    };
}
