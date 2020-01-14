package com.example.elnotas;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.elnotas.db.entity.NotaEntity;
import java.util.List;

public class NuevaNotaDialogViewModel extends AndroidViewModel {

    private LiveData<List<NotaEntity>> allNotas;
    private NotaRepository notaRepository;

    public NuevaNotaDialogViewModel(Application application){
        super(application);

        notaRepository = new NotaRepository(application);
        allNotas = notaRepository.getAll();
    }

    /**
     * Fragment que necesita recibir la nueva lista de datos
     *
     * @return lista de notas
     */
    public LiveData<List<NotaEntity>> getAllNotas(){
        return allNotas;
    }
    /**
     * Fragmento que inserte una nueva nota, deberá comunicarlo a este ViewModel
     *
     * @param nuevaNotaEntity
     */
    public void insertarNota(NotaEntity nuevaNotaEntity){
        notaRepository.insert(nuevaNotaEntity);
    }
}
