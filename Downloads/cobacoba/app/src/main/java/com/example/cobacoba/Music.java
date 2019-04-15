package com.example.cobacoba;

public class Music {
    private String nama;
    private int song;

    public Music(String nama, int song) {
        this.nama = nama;
        this.song = song;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
