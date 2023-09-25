package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExpIntent extends AppCompatActivity {

    EditText name;
    Button btn_Send;

    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp_intent);
        name = (EditText) findViewById(R.id.edt_nama);
        btn_Send = (Button) findViewById(R.id.btn_send);

        btn_Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String nama = name.getText().toString();
                    if (!nama.equals("")){
                        Intent i = new Intent(ExpIntent.this,ActivitySecond.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);
                    } else{
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(),"ERROR, TRY AGAIN !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}