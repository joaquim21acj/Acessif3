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

public class TecnicosLibra extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tecnicos_libras);
        Button buttonTecAliLibras = (Button) findViewById(R.id.buttonTecAliLibras);
        buttonTecAliLibras.setOnClickListener(this);
        Button buttonTecAdmLibras = (Button) findViewById(R.id.buttonTecAdmLibras);
        buttonTecAdmLibras.setOnClickListener(this);
        Button buttonTecLogLibras = (Button) findViewById(R.id.buttonTecLogLibras);
        buttonTecLogLibras.setOnClickListener(this);
        Button buttonTecQuiLibras = (Button) findViewById(R.id.buttonTecQuiLibras);
        buttonTecQuiLibras.setOnClickListener(this);
        Button buttonVoltarTecLibras = (Button) findViewById(R.id.buttonTecVoltarLibras);
        buttonVoltarTecLibras.setOnClickListener(this);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView videoTecnicos = new VideoView(this);
        videoTecnicos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonTecLogLibras: {
                logistica(v);
                break;
            }
            case R.id.buttonTecnologo: {
                quimica(v);
                break;
            }
            case R.id.buttonLicenciatura: {
                alimentos(v);
                break;
            }
            case R.id.buttonFIC:{
                administracao(v);
                break;
            }
            case R.id.buttonVoltarLibras:{
                VoltarTecLibras(v);
                break;
            }
        }

    }
    public void logistica (View view){
        VideoView videoTecnicos = (VideoView)findViewById(R.id.videoViewCTecnicos);
        String caminho = "android.resource://project.org.com.acessif/"+R.raw.curso_tecnico_logistica;
        Uri uri = Uri.parse(caminho);
        videoTecnicos.setVideoURI(uri);
        videoTecnicos.start();
    }
    public void quimica (View view){
        VideoView videoTecnicos = (VideoView)findViewById(R.id.videoViewCTecnicos);
        String caminho = "android.resource://project.org.com.acessif/"+R.raw.curso_tecnico_quimica;
        Uri uri = Uri.parse(caminho);
        videoTecnicos.setVideoURI(uri);
        videoTecnicos.start();
    }
    public void alimentos (View view){
        VideoView videoTecnicos = (VideoView)findViewById(R.id.videoViewCTecnicos);
        String caminho = "android.resource://project.org.com.acessif/"+R.raw.curso_tecnico_alimentos;
        Uri uri = Uri.parse(caminho);
        videoTecnicos.setVideoURI(uri);
        videoTecnicos.start();
    }

    public void administracao (View view){
        VideoView videoTecnicos = (VideoView)findViewById(R.id.videoViewCTecnicos);
        String caminho = "android.resource://project.org.com.acessif/"+R.raw.curso_tecnico_admin;
        Uri uri = Uri.parse(caminho);
        videoTecnicos.setVideoURI(uri);
        videoTecnicos.start();
    }
    public void VoltarTecLibras (View view){
        Intent intent = new Intent(TecnicosLibra.this, CursosLibras.class);
        startActivity(intent);
    }

}
