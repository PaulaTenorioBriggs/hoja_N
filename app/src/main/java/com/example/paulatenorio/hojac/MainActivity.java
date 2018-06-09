package com.example.paulatenorio.hojac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button Datos;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hv);

        Datos=(Button)findViewById(R.id.bt_datos);
        Datos.setOnClickListener(new View.OnClickListener(){
            @Override

            public void  onClick(View v){
                Intent Datos = new Intent(MainActivity.this, DatosPersonal.class);


                startActivity(Datos);
            }

        });


        Button estudios;


        estudios=(Button)findViewById(R.id.bt_datos);
        estudios.setOnClickListener(new View.OnClickListener(){
            @Override

            public void  onClick(View v){
                Intent estudios = new Intent(MainActivity.this, estudios.class);


                startActivity(estudios);
            }

        });

        Button referencias;


        estudios=(Button)findViewById(R.id.bt_datos);
        estudios.setOnClickListener(new View.OnClickListener(){
            @Override

            public void  onClick(View v){
                Intent estudios = new Intent(MainActivity.this, referencias.class);


                startActivity(estudios);
            }

        });

        Button experiencia;


        estudios=(Button)findViewById(R.id.bt_datos);
        estudios.setOnClickListener(new View.OnClickListener(){
            @Override

            public void  onClick(View v){
                Intent estudios = new Intent(MainActivity.this, experiencia.class);


                startActivity(estudios);
            }

        });

























    }
}
