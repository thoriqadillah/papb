package com.example.praktikumlifecycle.model;

public class Kontak {
    private String nama, noHp;
    private int foto;

    public Kontak(String nama, String noHp, int foto) {
        this.nama = nama;
        this.noHp = noHp;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public int getFoto() {
        return foto;
    }
}
