package com.example.praktikumlifecycle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private Button btnLogin;
    private TextView txtToRegister;
    private EditText emailLog, passwordLog;

    private String tempEmail;
    private String tempPassword;

    ActivityResultLauncher<Intent> intenLaunch;
    //test a
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //menghandle layout activity_main.xml

        emailLog = findViewById(R.id.formEmailLog);
        passwordLog = findViewById(R.id.formPasswordLog);

        //with click listener
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        txtToRegister = findViewById(R.id.txtToRegister);
        txtToRegister.setOnClickListener(this);

        intenLaunch = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK && result.getData() != null) {
                            tempEmail = result.getData().getStringExtra("keyEmail");
                            tempPassword = result.getData().getStringExtra("keyPassword");
                        }
                    }
                }
        );
    }


    @Override
    public void onClick(View view) {
        String txtEmail = emailLog.getText().toString();
        String txtPassword = passwordLog.getText().toString();

        if (view.getId() == btnLogin.getId()) {
            if (txtEmail.equals(tempEmail) && txtPassword.equals(tempPassword)) {
                Intent intent = new Intent(this, HomeActivity.class);
                intenLaunch.launch((intent));
            } else {
                Toast.makeText(this, "Data tidak ditemukan. Silahkan coba lagi atau mendaftar", Toast.LENGTH_SHORT).show();
            }
        } else if (view.getId() == txtToRegister.getId()) {
            Intent intent = new Intent(this, RegisterActivity.class);
            intenLaunch.launch((intent));
        }
    }
}


    // ========================= LIFE CYCLE METHOD ===================================
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        //membuat log pada console untuk mendebug
//        Log.d("Demo", "masuk ke onPause");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        //membuat log pada console untuk mendebug
//        Log.d("Demo", "masuk ke onResume");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//
//        //membuat log pada console untuk mendebug
//        Log.d("Demo", "masuk ke onRestart");
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        //membuat log pada console untuk mendebug
//        Log.d("Demo", "masuk ke onStart");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//
//        //membuat log pada console untuk mendebug
//        Log.d("Demo", "masuk ke onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//
//        //membuat log pada console untuk mendebug
//        Log.d("Demo", "masuk ke onDestroy");
//    }
    // ========================= END LIFE CYCLE METHOD ===================================

