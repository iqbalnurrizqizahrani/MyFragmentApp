package com.example.myfragmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLength;
    private EditText editTextWidth;
    private EditText editTextHeight;
    private TextView textViewVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
        editTextHeight = findViewById(R.id.editTextHeight);
        textViewVolume = findViewById(R.id.textViewVolume);

        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVolume();
            }
        });

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan aksi untuk tombol NEXT di sini
            }
        });

        Button btnFragment = findViewById(R.id.btnFragment);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(intent);
            }
        });
    }

    private void calculateVolume() {
        String lengthStr = editTextLength.getText().toString();
        String widthStr = editTextWidth.getText().toString();
        String heightStr = editTextHeight.getText().toString();

        if (!lengthStr.isEmpty() && !widthStr.isEmpty() && !heightStr.isEmpty()) {
            double length = Double.parseDouble(lengthStr);
            double width = Double.parseDouble(widthStr);
            double height = Double.parseDouble(heightStr);

            double volume = length * width * height;
            textViewVolume.setText(String.valueOf(volume));
        } else {
            textViewVolume.setText("Input tidak lengkap!");
        }
    }
}
