package com.example.danil.androidlabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String inputValue = intent.getStringExtra("input_value");

        TextView textView = (TextView) findViewById(R.id.scd_act_tv);
        textView.setText(inputValue);

        Button gotoBtn = (Button) findViewById(R.id.go_to_first_btn);
        gotoBtn.setOnClickListener(onClickListener);
    }

    public void openSecondActivity(){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openSecondActivity();
        }
    };
}
