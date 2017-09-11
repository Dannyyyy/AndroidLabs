package com.example.danil.androidlabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private TextView inputTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button inputBtn = (Button) findViewById(R.id.go_to_second_btn);
        inputBtn.setOnClickListener(onClickListener);

        inputTv = (TextView) findViewById(R.id.input_tv);
    }

    public void SendMessage(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendMessage();
        }
    };
}
