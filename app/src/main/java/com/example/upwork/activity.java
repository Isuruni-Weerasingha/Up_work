package com.example.upwork;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity extends AppCompatActivity {

    private static final int FILE_PICKER_REQUEST = 1;
    private Uri fileUri;
    private LinearLayout uploadSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity); // Ensure this matches your XML file

        uploadSection = findViewById(R.id.uploadSection);
        Button btnUploadCV = findViewById(R.id.btnUploadCV);
        Button btnCancel = findViewById(R.id.btnCancel);

        // Ensure uploadSection exists before setting click listener
        if (uploadSection != null) {
            uploadSection.setOnClickListener(v -> openFilePicker());
        } else {
            Toast.makeText(this, "Error: Upload section not found!", Toast.LENGTH_SHORT).show();
        }

        btnUploadCV.setOnClickListener(v -> {
            if (fileUri != null) {
                Toast.makeText(this, "CV Uploaded Successfully!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Please select a CV file!", Toast.LENGTH_SHORT).show();
            }
        });

        btnCancel.setOnClickListener(v -> finish());
    }

    private void openFilePicker() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*"); // Allows all file types
        String[] mimeTypes = {"application/pdf", "application/msword",
                "application/vnd.openxmlformats-officedocument.wordprocessingml.document"};
        intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(Intent.createChooser(intent, "Select CV"), FILE_PICKER_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FILE_PICKER_REQUEST && resultCode == Activity.RESULT_OK && data != null) {
            fileUri = data.getData();
            if (fileUri != null) {
                Toast.makeText(this, "File Selected: " + fileUri.getLastPathSegment(), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "File selection failed!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
