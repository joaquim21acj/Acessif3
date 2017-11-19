package project.org.com.acessif;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

/**
 * Created by joaqu on 16/09/2017.
 */

public class LicenciaturaLibras extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.licenciatura_libras);
        final Button buttonVoltarLic = (Button) findViewById(R.id.buttonVoltarLic);
        buttonVoltarLic.setOnClickListener(this);
        final Button buttonTecno = (Button) findViewById(R.id.buttonRepetirLic);
        buttonVoltarLic.setOnClickListener(this);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView videoBiblioteca = (VideoView) findViewById(R.id.videoViewLic);
        videoBiblioteca.setOnClickListener(this);
        String caminho = "android.resource://project.org.com.acessif/" + R.raw.curso_lic_quimica;
        Uri uri = Uri.parse(caminho);
        videoBiblioteca.setVideoURI(uri);
        videoBiblioteca.requestFocus();
        videoBiblioteca.start();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonVoltarLic: {
                voltarLic(v);
                break;
            }
            case R.id.buttonRepetirLic: {
                repetir(v);
                break;
            }
        }
    }
    public void repetir (View view){
        Intent intent = new Intent(LicenciaturaLibras.this, LicenciaturaLibras.class);
        startActivity(intent);
    }

    public void voltarLic (View view){
        Intent intent = new Intent(LicenciaturaLibras.this, CursosLibras.class);
        startActivity(intent);
    }
}
