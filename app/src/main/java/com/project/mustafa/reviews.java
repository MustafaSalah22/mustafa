package com.project.mustafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.project.mustafa.databinding.ActivityReviewsBinding;

public class reviews extends AppCompatActivity {
private ActivityReviewsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityReviewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final EditText nametext=(EditText)findViewById(R.id.editTitle);
binding.btnSbumit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(reviews.this, "submiting ...", Toast.LENGTH_SHORT).show();
    }
});



    }
}