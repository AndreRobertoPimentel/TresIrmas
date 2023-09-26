package com.example.a1sprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView btSelfie = findViewById(R.id.btSelfie);

        btSelfie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(MainActivity.this, FotoCamera.class);
                //É possível passar valores entre as telas (opcional)
                it.putExtra("nome1","Android");
                it.putExtra("numero",3);
                startActivity(it);//Abre a tela
            }
        });
        
    }
}