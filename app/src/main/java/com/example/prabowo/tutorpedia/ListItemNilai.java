package com.example.prabowo.tutorpedia;

import android.app.LauncherActivity;

public class ListItemNilai {

    private String judulnilai;
    private String nilai;

public ListItemNilai() {

}

    public ListItemNilai(String judulnilai,String nilai) {
        this.judulnilai = judulnilai;
        this.nilai = nilai;

    }

    public String getJudulnilai() {
        return judulnilai;
    }

    public String getNilai() {
        return nilai;
    }
}