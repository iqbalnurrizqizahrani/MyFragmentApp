package com.example.myfragmentapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FragmentActivity extends AppCompatActivity {
    private Button btnShowFragment ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        Button btnShowFragment = findViewById(R.id.btnShowFragment);

        btnShowFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,
                        new SimpleFragment()).commit();
            }
        });
    }
}
