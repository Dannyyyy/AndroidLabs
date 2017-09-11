package com.example.danil.androidlabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button inputBtn = (Button) findViewById(R.id.go_to_first_btn);
        inputBtn.setOnClickListener(onClickListener);
    }

    public void openFirstActivity(){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openFirstActivity();
        }
    };
}
