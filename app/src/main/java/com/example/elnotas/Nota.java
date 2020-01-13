package com.example.elnotas;

public class Nota {
    private String titulo;
    private String contenido;
    private boolean fav;
    private int color;

    public Nota(String titulo, String contenido, boolean fav, int color) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fav = fav;
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
