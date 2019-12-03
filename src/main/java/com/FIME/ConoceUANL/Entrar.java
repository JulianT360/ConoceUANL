package com.FIME.ConoceUANL;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Entrar extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);
        ImageButton entrar = (ImageButton)findViewById(R.id.entrar);
        entrar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(Entrar.this,Inicio.class));
            }
        });
    }
}