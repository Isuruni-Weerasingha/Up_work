package com.example.upwork;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class setting extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;

    private ImageView profileImage;
    private EditText etFullName, etEmail, etPrimaryPhone, etSecondaryPhone, etLocation, etBio;
    private Button btnSaveProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        profileImage = findViewById(R.id.profile_image);
        etFullName = findViewById(R.id.et_full_name);
        etEmail = findViewById(R.id.et_email);
        etPrimaryPhone = findViewById(R.id.et_primary_phone);
        etLocation = findViewById(R.id.et_location);
        etBio = findViewById(R.id.et_bio);
        btnSaveProfile = findViewById(R.id.btn_save_profile);

        profileImage.setOnClickListener(v -> openGallery());

        btnSaveProfile.setOnClickListener(v -> saveProfile());
    }

    // Open Gallery to Choose Profile Picture
    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null) {
            Uri imageUri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                profileImage.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Save Profile Data
    private void saveProfile() {
        String fullName = etFullName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String primaryPhone = etPrimaryPhone.getText().toString().trim();
        String secondaryPhone = etSecondaryPhone.getText().toString().trim();
        String location = etLocation.getText().toString().trim();
        String bio = etBio.getText().toString().trim();

        if (fullName.isEmpty() || email.isEmpty() || primaryPhone.isEmpty()) {
            Toast.makeText(this, "Full Name, Email, and Primary Phone are required!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Here you can save data to a database or shared preferences
        Toast.makeText(this, "Profile Saved Successfully!", Toast.LENGTH_SHORT).show();
    }

    public void onBackClick(View view) {
        Intent intent = new Intent(setting.this, profile.class);  // Replace with your actual home activity
        startActivity(intent);
        finish();  // Close current activity after navigating
    }
}
