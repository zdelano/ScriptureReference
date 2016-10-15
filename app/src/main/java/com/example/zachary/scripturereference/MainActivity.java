package com.example.zachary.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String BOOK = "Book";
    public static final String CHAPTER = "Chapter";
    public static final String VERSE = "Verse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendReference(View view) {
        // an intent binds two activities at runtime
        // we are passing the intent to ShareScriptureActivity
        Intent intent = new Intent(this, ShareScriptureActivity.class);

        // find the correct text box for book
        EditText editText = (EditText) findViewById(R.id.book);
        String message = editText.getText().toString();
        // pass the book message to ShareScriptureActivity
        intent.putExtra(BOOK, message);

        // find the correct text box for chapter
        EditText editText2 = (EditText) findViewById(R.id.chapter);
        String message2 = editText2.getText().toString();
        // pass the chapter message to ShareScriptureActivity
        intent.putExtra(CHAPTER, message2);

        // find the correct text box for verse
        EditText editText3 = (EditText) findViewById(R.id.verse);
        String message3 = editText3.getText().toString();
        // pass the verse to ShareScriptureActivity
        intent.putExtra(VERSE, message3);

        startActivity(intent);
    }
}
