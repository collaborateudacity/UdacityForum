package com.example.android.udacityforum;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ForumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        SQLiteDatabase db=openOrCreateDatabase("ForumDB", Context.MODE_PRIVATE,null);
    }
}
