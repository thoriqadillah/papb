package com.example.praktikumlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtToLogin;
    private Button btnRegister;
    private EditText usernameReg, emailReg, passwordReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameReg = findViewById(R.id.formUsernameReg);
        emailReg = findViewById(R.id.formEmailReg);
        passwordReg = findViewById(R.id.formPasswordReg);

        //with click listener
        btnRegister = findViewById(R.id.btnReg);
        btnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
//        String username = usernameReg.getText().toString();
        String email = emailReg.getText().toString();
        String password = passwordReg.getText().toString();

        if (view.getId() == btnRegister.getId()) {
            Intent intent = new Intent();
            intent.putExtra("keyEmail", email);
            intent.putExtra("keyPassword", password);
            setResult(Activity.RESULT_OK, intent);
            finish();
        }



    }
}