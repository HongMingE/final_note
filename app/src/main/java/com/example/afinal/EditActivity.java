package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        final EditText etEditTitle = findViewById(R.id.etEditTitle);
        final EditText etEditContent = findViewById(R.id.etEditContent);

        // Retrieve the content to be edited
        Intent intent = getIntent();
        if (intent.hasExtra("title") && intent.hasExtra("content")) {
            String title = intent.getStringExtra("title");
            String content = intent.getStringExtra("content");
            etEditTitle.setText(title);
            etEditContent.setText(content);
        }

        Button btnSaveEdit = findViewById(R.id.btnSaveEdit);
        btnSaveEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editedTitle = etEditTitle.getText().toString();
                String editedContent = etEditContent.getText().toString();

                // Save the edited content (you can implement your own logic here)

                // For simplicity, just go back to MainActivity
                startActivity(new Intent(EditActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}




