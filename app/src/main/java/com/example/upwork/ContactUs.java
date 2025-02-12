package com.example.upwork;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ContactUs extends AppCompatActivity {
    EditText etName, etEmail, etMessage;
    Button btnSend;
    TextView txtEmail, txtWhatsApp, txtHotline, txtFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etMessage = findViewById(R.id.etMessage);
        btnSend = findViewById(R.id.btnSend);
        txtEmail = findViewById(R.id.txtEmail);
        txtWhatsApp = findViewById(R.id.txtWhatsApp);
        txtHotline = findViewById(R.id.txtHotline);
        txtFacebook = findViewById(R.id.txtFacebook);

        // Send Email
        txtEmail.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:support@upwork.com"));
            startActivity(emailIntent);
        });

        // Open WhatsApp Chat
        txtWhatsApp.setOnClickListener(v -> {
            String phoneNumber = "+1234567890";
            Intent whatsappIntent = new Intent(Intent.ACTION_VIEW);
            whatsappIntent.setData(Uri.parse("https://wa.me/" + phoneNumber));
            startActivity(whatsappIntent);
        });

        // Call Hotline
        txtHotline.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:+1122334455"));
            startActivity(callIntent);
        });

        // Open Facebook Page
        txtFacebook.setOnClickListener(v -> {
            Intent fbIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/UpWork"));
            startActivity(fbIntent);
        });

        // Send Contact Form
        btnSend.setOnClickListener(v -> sendEmail());
    }

    private void sendEmail() {
        String name = etName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String message = etMessage.getText().toString().trim();

        if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        String mailto = "mailto:support@upwork.com" +
                "?subject=" + Uri.encode("Contact Us Query from " + name) +
                "&body=" + Uri.encode("Name: " + name + "\nEmail: " + email + "\n\nMessage:\n" + message);

        Intent emailIntent = new Intent(Intent.ACTION_VIEW);
        emailIntent.setData(Uri.parse(mailto));

        try {
            startActivity(emailIntent);
        } catch (Exception e) {
            Toast.makeText(this, "No email app found", Toast.LENGTH_SHORT).show();
        }
    }
}
