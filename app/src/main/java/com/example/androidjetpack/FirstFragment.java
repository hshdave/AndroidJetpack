package com.example.androidjetpack;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    Button btn_second;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("First","onCreate Called!");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d("First","onCreateView Called!");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d("First","onViewCreated Called!");

        btn_second = view.findViewById(R.id.btn_firstFrag);

        View.OnClickListener navigate = Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment);

        btn_second.setOnClickListener(navigate);

       /* btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment);
            }
        });*/
    }
}