package com.example.elnotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class NotaActivity extends AppCompatActivity implements NotasInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, new NotaFragment()).commit();
    }

    @Override
    public void editNotaClick(Nota nota) {

    }

    @Override
    public void deleteNotaClick(Nota nota) {

    }

    @Override
    public void favNotaClick(Nota nota) {

    }
}
