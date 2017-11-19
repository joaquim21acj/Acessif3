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
 * Created by joaqu on 28/08/2017.
 */

public class Libras extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicial_libras);
        final Button buttonCursosLibras = (Button) findViewById(R.id.buttonCursosLibras);
        buttonCursosLibras.setOnClickListener(this);
        final Button buttonBibliotecaLibras = (Button) findViewById(R.id.buttonBibliotecaLibras);
        buttonBibliotecaLibras.setOnClickListener(this);
        final Button buttonAssistenciaLibras = (Button) findViewById(R.id.buttonAssistenciaLibras);
        buttonAssistenciaLibras.setOnClickListener(this);
        final Button buttonOutrosCampiLibras = (Button) findViewById(R.id.buttonOutrosCampiLibras);
        buttonOutrosCampiLibras.setOnClickListener(this);
        final Button buttonVoltarLibras = (Button) findViewById(R.id.buttonVoltarLibras);
        buttonVoltarLibras.setOnClickListener(this);
//        Button buttonPlayInicial = (Button) findViewById(R.id.buttonPlayInicial);
//        buttonPlayInicial.setOnClickListener(this);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView videoBiblioteca = (VideoView)findViewById(R.id.videoViewInicial);
        videoBiblioteca.setOnClickListener(this);
        String caminho = "android.resource://project.org.com.acessif/"+R.raw.inicial_libras;
        Uri uri = Uri.parse(caminho);
        videoBiblioteca.setVideoURI(uri);
        videoBiblioteca.requestFocus();
        videoBiblioteca.start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonCursosLibras: {
                cursosLibras(v);
                break;
            }
            case R.id.buttonBibliotecaLibras: {
                bibliotecaLibras(v);
                break;
            }
            case R.id.buttonAssistenciaLibras: {
                assistenciaLibras(v);
                break;
            }
            case R.id.buttonOutrosCampiLibras:{
                break;
            }
            case R.id.buttonVoltarLibras:{
                voltar(v);
                break;
            }
            /*
            case R.id.buttonPlayInicial:{
                VideoView videoBiblioteca = (VideoView)findViewById(R.id.videoViewBiblioteca);
                videoBiblioteca.setOnClickListener(this);
                String caminho = "android.resource://project.org.com.acessif/"+R.raw.biblioteca;
                Uri uri = Uri.parse(caminho);
                videoBiblioteca.setVideoURI(uri);
                videoBiblioteca.requestFocus();
                videoBiblioteca.start();
            }
            */
        }

    }
    public void cursosLibras (View view){
        Intent intent = new Intent(Libras.this, CursosLibras.class);
        startActivity(intent);
    }
    public void bibliotecaLibras (View view){
        Intent intent = new Intent(Libras.this, BibliotecaLibras.class);
        startActivity(intent);
    }
    public void assistenciaLibras (View view){
        Intent intent = new Intent(Libras.this, AssistenciaLibras.class);
        startActivity(intent);
    }
    public void playVideo (View view){
        Intent intent = new Intent(Libras.this, Voz.class);
        startActivity(intent);
    }
    public void voltar (View view){
        Intent intent = new Intent(Libras.this, PNE.class);
        startActivity(intent);
    }
}
