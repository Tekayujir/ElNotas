package com.example.elnotas;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.elnotas.db.NotaRoomDatabase;
import com.example.elnotas.db.dao.NotaDao;
import com.example.elnotas.db.entity.NotaEntity;

import java.util.List;

public class NotaRepository {
    private NotaDao notaDao;
    private LiveData<List<NotaEntity>> allNotas;

    public NotaRepository(Application application){
        NotaRoomDatabase db = NotaRoomDatabase.getDataBase(application);
        notaDao = db.notaDao();
        allNotas = notaDao.getAll();
    }

    /**
     * Devuelve todas las notas
     *
     * @return allNotas
     */
    public LiveData<List<NotaEntity>> getAll(){
        return allNotas;
    }

    /**
     * Inserta una nota (con AsyncTask)
     *
     * @param nota
     */
    public void insert (NotaEntity nota){
        new insertAsyncTask(notaDao).execute(nota);
    }
    private static class insertAsyncTask extends AsyncTask<NotaEntity, Void, Void>{
        private NotaDao ndat;

        insertAsyncTask(NotaDao dao){
            ndat = dao;
        }

        @Override
        protected Void doInBackground(NotaEntity... notaEntities) {
            ndat.insert(notaEntities[0]);
            return null;
        }
    }
}
