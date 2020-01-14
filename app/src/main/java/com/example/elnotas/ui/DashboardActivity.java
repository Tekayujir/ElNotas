package com.example.elnotas.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.elnotas.R;

public class DashboardActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);

        getSupportActionBar().hide();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, new NotaFragment()).commit();
    }

}
