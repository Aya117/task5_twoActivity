package edu.cs.birzeit.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtMessage;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage=findViewById(R.id.txtMessage);
        btnSend=findViewById(R.id.btnSend);

    }


    public void OnClickSend(View view) {
    String msg= txtMessage.getText().toString();
    Intent intent = new Intent(this,Main2Activity.class);
    intent.putExtra("data",msg);
    startActivity(intent);


    }
}