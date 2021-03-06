package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "closerelatives")
public class CloseRelative {

    @PrimaryKey(autoGenerate = true)
    @noNull
    @ColumnInfo(name= "CloseRelativeId")
    private int mId;


    @Nullable
    @ColumnInfo(name = "CloseRelativeName")
    private String mCloseRelativeName;

    private String mKinship;

    public closerelatives(@Nullable String mCloseRelativeName, String mKinship, int mScore, String mCreationDate) {
        this.mCloseRelativeName = mCloseRelativeName;
        this.mKinship = mKinship;
        this.mScore = mScore;
        this.mCreationDate = mCreationDate;
    }


    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmCloseRelativeName() {
        return mCloseRelativeName;
    }

    public void setmName(String mCloseRelativeName) {
        this.mCloseRelativeName = mCloseRelativeName;
    }

    public String getmKinship() {
        return mKinship;
    }

    public void setmKinship(String mKinship) {
        this.mKinship = mKinship;
    }

    public int getmScore() {
        return mScore;
    }

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }

    public String getmCreationDate() {
        return mCreationDate;
    }

    public void setmCreationDate(String mCreationDate) {
        this.mCreationDate = mCreationDate;
    }

    //private String mName;
   // private String mKinship;
    private int mScore;
    private String mCreationDate;
