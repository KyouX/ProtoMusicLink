package com.example.kiomi.musiclink;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IniciarSesion extends Activity implements View.OnClickListener {

    public static final int COD_REQ = 1000;
    Button butIniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

    @Override
    public void onClick(View v) {

    }
}
