package com.example.zachary.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShareScriptureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_scripture);

        Intent intent = getIntent();
        String message = "Your favorite scripture is: " + intent.getStringExtra(MainActivity.BOOK)
                + " " + intent.getStringExtra(MainActivity.CHAPTER) + ":"
                + intent.getStringExtra(MainActivity.VERSE);
        TextView textView = new TextView(this);
        textView.setTextSize(12);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_share_scripture);
        layout.addView(textView);
    }
}
