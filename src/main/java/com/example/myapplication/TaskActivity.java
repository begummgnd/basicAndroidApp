package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class TaskActivity extends AppCompatActivity {

    private TextView txtField1,txtMessage1;
    private EditText inputField1;
    private Button btn1;
    private String task;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        txtField1 = (TextView)findViewById(R.id.textField1);
        inputField1 =(EditText)findViewById(R.id.inputField1);
        btn1 = (Button)findViewById(R.id.btn1);
        txtMessage1 = (TextView)findViewById(R.id.txtMessage1);
        inputField1.setHint("assign a task");
        inputField1.setText("");
        btn1.setText("Add");
        txtField1.setText("");
        txtField1.setHint("assigned tasks");
        txtMessage1.setText("");
    }

    public void btn1Click(View v){
        task = inputField1.getText().toString();
        if(!TextUtils.isEmpty(task)){
            txtField1.setText(task+"\n");
        }
        else txtMessage1.setText("You must assign a task!");
    }

    public void textField1OnUpdate(View v){
        txtField1.setText(task+"\n");
    }
}