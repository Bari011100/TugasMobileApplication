package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);

        Intent intent1 = getIntent();
        String letsee = intent1.getStringExtra("letsee");

        TextView textView = findViewById(R.id.textView3);
        textView.setText(letsee);


        Button btngoback = findViewById(R.id.btnback2);
        btngoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                intent.putExtra("balik","Muhammad Farhan Albari " + "NIM : 2312500511");
                startActivity(intent);
            }
        });


    }


}
