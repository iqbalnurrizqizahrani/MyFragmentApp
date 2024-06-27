package com.example.myfragmentapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class SimpleFragment extends Fragment {
    private Button btnNextFragment;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple, container, false);

        Button btnNextFragment = view.findViewById(R.id.btnNextFragment);
        btnNextFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Ini dari Fragment !", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}