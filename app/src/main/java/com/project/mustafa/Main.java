package com.project.mustafa;

import static com.project.mustafa.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.project.mustafa.databinding.ActivityMainBinding;

public class Main extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.offers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main.this,offers.class));
                finish();
            }
        });
        binding.reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main.this,reviews.class));
                finish();
            }
        });

        TextView textView=(TextView)findViewById(id.dis);
        Intent intent = getIntent();
        String name= intent.getStringExtra("myname");

        if (name.trim().equals(""))
            textView.setText("Hello User");
        else
            textView.setText("Hello " + name);

    }
}