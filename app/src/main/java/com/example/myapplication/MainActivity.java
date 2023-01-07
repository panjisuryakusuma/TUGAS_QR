package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView QR_img;
    EditText QR_text;
    Button QR_create,QR_scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QR_img = findViewById(R.id.QR_view);
        QR_text = findViewById(R.id.QR_text);
        QR_create = findViewById(R.id.QR_creat);
        QR_scan = findViewById(R.id.QR_scan);

        QR_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = QR_text.getText().toString();
                if(data.isEmpty())
                {
                    QR_text.setError("valueRequered Here");
                }
                else
                {

                }


            }
        });
    }
}