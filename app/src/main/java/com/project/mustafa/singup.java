package com.project.mustafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.project.mustafa.databinding.ActivitySingupBinding;

public class singup extends AppCompatActivity {
    EditText et_username, et_password,et_password1;
    Button btn_login;
private ActivitySingupBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySingupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        et_password1 = (EditText) findViewById(R.id.et_password1);
        btn_login = (Button) findViewById(R.id.btn_login);

        final EditText nametext=(EditText)findViewById(R.id.et_username);
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    String name=nametext.getText().toString();
                    Intent intent=new Intent(getApplicationContext(),Main.class);
                    intent.putExtra("myname",name);
                    startActivity(intent);


            }
        });
    }
}