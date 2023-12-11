package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText haslo;
    EditText login;

    TextView textview1;
    Button guzik;
    String hasloval;
    String loginval;

    String haslofr = "abc";

    String[] loginy = {"gamer", "admin", "plebs"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        haslo = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.editTextText);
        guzik = findViewById(R.id.button);
        textview1 = findViewById(R.id.textView);




        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Logowanie niepowiodło się!")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });


        guzik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loginval = login.getText().toString();
                hasloval = haslo.getText().toString();


    if (hasloval.equals(haslofr) && !loginval.isEmpty() && (loginval.equals(loginy[0])|| loginval.equals(loginy[1])|| loginval.equals(loginy[2]))) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("loginx", loginval);
        MainActivity.this.startActivity(intent);
    } else {


        AlertDialog alert = builder.create();
        alert.show();
    }

}

        });



    }
}