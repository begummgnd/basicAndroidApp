package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtMessage;
    private Button btnMessage,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMessage = (TextView)findViewById(R.id.txtMessage);
        txtMessage.setText("Deneme mesajı");
        txtMessage.setTextColor(Color.RED);
        System.out.println(txtMessage.getText().toString());
       // txtMessage.setVisibility(View.INVISIBLE);
        txtMessage.setTextSize(33);

        btnMessage = (Button)findViewById(R.id.button3);
        btnMessage.setText("Click Button");

        button4 =(Button)findViewById(R.id.button4);
        button4.setText("Task");
    }

    public void button4Click(View v){
        Intent intent = new Intent(MainActivity.this,TaskActivity.class);  //MainActivity.this yerine getApplicationContext() de kullanılabilir. Burada hangi activity'den hangi activity'e gideceğimize karar veriyoruz. This key'i ile mevcut activity'i  alıyoruz. İkinci parametre olarak ise gitmek istediğimiz class'ı veriyoruz.
        startActivity(intent); //intent'i başlatır.
    }

    public void btnClick3(View v){
        txtMessage.setText("Messsage for example");
    }
}