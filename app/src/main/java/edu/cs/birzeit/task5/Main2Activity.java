package edu.cs.birzeit.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView txtShowMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        txtShowMessage=findViewById(R.id.txtShowMessage);
        String msg=intent.getStringExtra("data");
        txtShowMessage.setText(msg);
    }
}