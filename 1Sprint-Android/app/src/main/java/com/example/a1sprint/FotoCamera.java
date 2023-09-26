package com.example.a1sprint;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FotoCamera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_camera);

        //Pedir a permissão da câmera e verificar se já permitiu ou não

        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){

            //se a permissão da CAMERA estiver como diferente de GRANTED(permitido)
            //então perguntamos novamente se ele permite ou não o uso de CAMERA

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA},100); // o código 100 pode ser qualquer número inteiro
            //é utilizado para armazenar a decisão do usuário com relação
            //à permissão da CAMERA, ou seja, se permitiu ou não

        }

        //objetos para os componentes da tela

        Button btFoto = findViewById(R.id.btFoto);
        Button btVoltar = findViewById(R.id.btVoltar);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(FotoCamera.this, MainActivity.class);
                //É possível passar valores entre as telas (opcional)
                it.putExtra("nome1","Android");
                it.putExtra("numero",3);
                startActivity(it);//Abre a tela
            }
        });

        btFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Abre a câmera
                Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                //Precisamos indicar que irá abrir a câmera, aguarda tirar a foto
                //e recuperar a foto depois
                recuperaFoto.launch(it);//Método para indicar o que será feito
                //Depois que a foto voltar ao nosso aplicativo
            }
        });
    }//Fecha o onCreate

    //Códigoque será utilizado quando a foto "voltar" da câmera
    ActivityResultLauncher<Intent> recuperaFoto = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {

            //Testar se tem uma foto

            if (result.getResultCode() == RESULT_OK){

                //Recuperar foto

                Bitmap foto = (Bitmap) result.getData().getExtras().get("Data");

                //Acessar ImageView

                ImageView imgFoto = findViewById(R.id.imgFoto);

                //Colocar a foto no ImageView

                imgFoto.setImageBitmap(foto);

                //A maioria dos celulares tira em modo paisagem (deitada)
                imgFoto.setRotation(90);//Girar 90 graus sentido horário
            }

        }
    });
        
    }
