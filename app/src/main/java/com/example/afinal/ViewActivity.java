package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        TextView tvViewTitle = findViewById(R.id.tvViewTitle);
        TextView tvViewContent = findViewById(R.id.tvViewContent);

        // Retrieve the content to be viewed
        Intent intent = getIntent();
        if (intent.hasExtra("title") && intent.hasExtra("content")) {
            String title = intent.getStringExtra("title");
            String content = intent.getStringExtra("content");
            tvViewTitle.setText(title);
            tvViewContent.setText(content);
        }
    }
}





