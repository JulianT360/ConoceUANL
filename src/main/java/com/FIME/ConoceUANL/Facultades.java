package com.FIME.ConoceUANL;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Facultades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultades);
        onFacultadPressed();
    }

    private void onFacultadPressed() {
        // FIME
        ImageButton fime =  findViewById(R.id.btnFime);
        fime.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.725036, -100.313464));
            }
        });
        // FACDYC
        ImageButton facdyc = findViewById(R.id.btnFacdyc);
        facdyc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.726444, -100.310603));
            }
        });
        // FACPYA
        ImageButton facpya =  findViewById(R.id.btnFacpya);
        facpya.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.727317, -100.309144));
            }
        });

        // FARQ
        ImageButton farq =  findViewById(R.id.btnFarq);
        farq.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.725207, -100.312408));
            }
        });
        // FCB
        ImageButton fcb = findViewById(R.id.btnFcb);
        fcb.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.724253, -100.316370));
            }
        });
        // FCFM
        ImageButton fcfm = findViewById(R.id.btnFcfm);
        fcfm.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.725214, -100.315217));
            }
        });
        // FCQ
        ImageButton fcq = findViewById(R.id.btnFcq);
        fcq.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.724222, -100.315469));
            }
        });
        // FFYL
        ImageButton ffyl = findViewById(R.id.btnFfyl);
        ffyl.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.727174, -100.310469));
            }
        });
        // FIC
        ImageButton fic = findViewById(R.id.btnFic);
        fic.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.724763, -100.314006));
            }
        });
        // FOD
        ImageButton fod = findViewById(R.id.btnFod);
        fod.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.727557, -100.312470));
            }
        });
        // FTSYDH
        ImageButton ftsydh = findViewById(R.id.btnFtsydh);
        ftsydh.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.727834, -100.310081));
            }
        });

    }

    private Intent setIntentLocalizador(double lan, double lng) {
        Intent intent = new Intent(Facultades.this, Localizador.class);
        intent.putExtra("lan", lan);
        intent.putExtra("lng", lng);
        return intent;
    }
}
