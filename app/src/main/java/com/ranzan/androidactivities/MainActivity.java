package com.ranzan.androidactivities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String Tag = "abcd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag, "onCreate");
        //finish();
        Log.d(Tag, "onCreate2");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag, "onRestart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag, "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag, "onPause");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag, "onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag, "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag, "onDestroy");


    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Activity")
                .setMessage("Are you sure you want to close this activity?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int n) {
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
