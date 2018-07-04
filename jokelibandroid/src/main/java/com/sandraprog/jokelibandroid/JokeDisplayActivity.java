package com.sandraprog.jokelibandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;


public class JokeDisplayActivity extends AppCompatActivity {

    public static final String JOKETEXT_KEY = "JOKETEXT_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);


        TextView jokeTextView = findViewById(R.id.tv_jokeText);

        String jokeText = null;
        Intent intent = getIntent();
        jokeText = intent.getStringExtra(JOKETEXT_KEY);
        Log.d("123456789", "jokeText from intent=" + jokeText);

        if (!TextUtils.isEmpty(jokeText)) {
            jokeTextView.setText(jokeText);
        } else {
            jokeTextView.setText(R.string.no_joke_text);
        }

    }

}
