package com.juaracoding.ujiancracker.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Dasboard implements Parcelable {

    private String title, level;

    public Dasboard(String title, String level) {
        this.title = title;
        this.level = level;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.level);
    }

    public void readFromParcel(Parcel source) {
        this.title = source.readString();
        this.level = source.readString();
    }

    public Dasboard() {
    }

    protected Dasboard(Parcel in) {
        this.title = in.readString();
        this.level = in.readString();
    }

    public static final Parcelable.Creator<Dasboard> CREATOR = new Parcelable.Creator<Dasboard>() {
        @Override
        public Dasboard createFromParcel(Parcel source) {
            return new Dasboard(source);
        }

        @Override
        public Dasboard[] newArray(int size) {
            return new Dasboard[size];
        }
    };
}
