package com.example.kiomi.musiclink;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    public static final int COD_REQ=1000;
    public static final int COD_REQ2=2000;
    Button butRegistrarte, butIniciarFB, butIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butRegistrarte = (Button) findViewById(R.id.butRegistrate);
        butIniciarFB = (Button) findViewById(R.id.butIniciarFB);
        butIniciarSesion = (Button) findViewById(R.id.butIniciarSesion);

        butRegistrarte.setOnClickListener(this);
        butIniciarFB.setOnClickListener(this);
        butIniciarSesion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.butIniciarSesion || view.getId() == R.id.butIniciarFB){
            Intent intent = new Intent();
            intent.setClass(this,IniciarSesion.class);
            startActivityForResult(intent, COD_REQ);
        } else if (view.getId() == R.id.butRegistrate){
            Intent intent = new Intent();
            intent.setClass(this, Registro.class);
            startActivityForResult(intent, COD_REQ2);

        }
    }
}
