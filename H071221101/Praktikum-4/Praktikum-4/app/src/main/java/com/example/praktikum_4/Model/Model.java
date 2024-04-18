package com.example.praktikum_4.Model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Model implements Parcelable {

    private String nama, username, konten;
    private Integer imageprofile, imagefeed;

    public Model(String nama, String username, String konten, Integer imageprofile, Integer imagefeed) {
        this.nama = nama;
        this.username = username;
        this.konten = konten;
        this.imageprofile = imageprofile;
        this.imagefeed = imagefeed;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public Integer getImageprofile() {
        return imageprofile;
    }

    public void setImageprofile(Integer imageprofile) {
        this.imageprofile = imageprofile;
    }

    public Integer getImagefeed() {
        return imagefeed;
    }

    public void setImagefeed(Integer imagefeed) {
        this.imagefeed = imagefeed;
    }

    protected Model(Parcel in) {
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
    }
}
