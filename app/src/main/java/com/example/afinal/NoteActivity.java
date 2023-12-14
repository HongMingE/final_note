package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        final EditText etNoteTitle = findViewById(R.id.etNoteTitle);
        final EditText etNoteContent = findViewById(R.id.etNoteContent);

        Button btnSaveNote = findViewById(R.id.btnSaveNote);
        btnSaveNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = etNoteTitle.getText().toString();
                String content = etNoteContent.getText().toString();

                // Save the note (you can implement your own logic here)

                // Start ViewActivity or EditActivity based on your conditions
                Intent intent;
                if (shouldEdit()) {
                    intent = new Intent(NoteActivity.this, EditActivity.class);
                } else {
                    intent = new Intent(NoteActivity.this, ViewActivity.class);
                }

                // Pass data to the next activity if needed
                intent.putExtra("title", title);
                intent.putExtra("content", content);

                startActivity(intent);
                finish();
            }
        });
    }

    // Add your own logic to determine if editing is needed
    private boolean shouldEdit() {
        // For example, you may check if the content meets certain conditions
        // and return true if editing is required
        return true;
    }
}




