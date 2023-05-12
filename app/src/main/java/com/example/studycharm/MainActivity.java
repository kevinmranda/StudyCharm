package com.example.studycharm;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText username, password;
    public Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username  = (EditText) findViewById(R.id.username);
        password  = (EditText) findViewById(R.id.password);
        submit  = (Button) findViewById(R.id.submit);

        submit.setOnClickListener((View.OnClickListener) submit);

    }

    @Override
    public void onClick(View v) {
        login();
    }

    private void login() {

        String usernameInput  = username.getText().toString().trim();
        String passwordInput  = password.getText().toString().trim();

        if(usernameInput.equals("kevinMranda") && passwordInput.equals("12345")) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);

            this.finish();
        } else {
            Toast.makeText(this,"Wrong username or password!",Toast.LENGTH_SHORT).show();
        }
    }
}