package com.example.android.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        textView = (TextView) findViewById(R.id.tv_display);

        Intent retreivedInent = getIntent();

        if(retreivedInent.hasExtra(Intent.EXTRA_TEXT)) {
            String str = retreivedInent.getStringExtra(Intent.EXTRA_TEXT);

            textView.setText(str);
        }
    }
}
