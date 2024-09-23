package com.example.helpik2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.detailImage);
        TextView descriptionView = findViewById(R.id.detailDescription);

        int imageResId = getIntent().getIntExtra("imageResId", 0);
        String description = getIntent().getStringExtra("description");

        imageView.setImageResource(imageResId);
        descriptionView.setText(description);
    }
}