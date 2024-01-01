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

            // Check if the content is from EditActivity
            if (intent.hasExtra("isEdit") && intent.getBooleanExtra("isEdit", false)) {
                tvViewTitle.setText("編輯標題: " + title);
                tvViewContent.setText("編輯內容: " + content);
            } else {
                tvViewTitle.setText("標題: " + title);
                tvViewContent.setText("內容: " + content);
            }
        }
    }
}
