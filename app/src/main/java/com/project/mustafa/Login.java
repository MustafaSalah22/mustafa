package com.project.mustafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends AppCompatActivity {
    EditText et_username, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        Button startbutton=(Button)findViewById(R.id.btn_login);
        Button noAccount=(Button)findViewById(R.id.noAccount);
        final EditText nametext=(EditText)findViewById(R.id.et_username);

      noAccount.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(Login.this,singup.class));
          }
      });


        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_username.getText().toString().equals("mustafa") && et_password.getText().toString().equals("2001")) {
                    Toast.makeText(Login.this, "Username and Password is correct", Toast.LENGTH_SHORT).show();
                    String name=nametext.getText().toString();
                    Intent intent=new Intent(getApplicationContext(),Main.class);
                    intent.putExtra("myname",name);
                    startActivity(intent);

                } else {
                    Toast.makeText(Login.this, "Faild", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}