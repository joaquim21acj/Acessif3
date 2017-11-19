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

public class FICLibras extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fic_libras);
        final Button buttonIngles = (Button) findViewById(R.id.buttonEscolhaInglês);
        buttonIngles.setOnClickListener(this);
        final Button buttonLibras = (Button) findViewById(R.id.buttonEscolhaLibras);
        buttonLibras.setOnClickListener(this);
        final Button buttonVoltar = (Button) findViewById(R.id.buttonVoltarFIC);
        buttonLibras.setOnClickListener(this);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView videoBiblioteca = (VideoView)findViewById(R.id.videoViewFICEscolha);
        videoBiblioteca.setOnClickListener(this);
        String caminho = "android.resource://project.org.com.acessif/"+R.raw.escolha_fic;
        Uri uri = Uri.parse(caminho);
        videoBiblioteca.setVideoURI(uri);
        videoBiblioteca.requestFocus();
        videoBiblioteca.start();
}
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonEscolhaInglês: {
                ingles(v);
                break;
            }
            case R.id.buttonEscolhaLibras: {
                libras(v);
                break;
            }
            case R.id.buttonVoltarFIC: {
                voltar(v);
                break;
            }
        }
    }
    public void voltar (View view){
        Intent intent = new Intent(FICLibras.this, CursosLibras.class);
        startActivity(intent);
    }
    public void libras (View view){
        Intent intent = new Intent(FICLibras.this, FICLibrasLibras.class);
        startActivity(intent);
        }
    }

