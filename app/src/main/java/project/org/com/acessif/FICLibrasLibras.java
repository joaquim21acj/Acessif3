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
 * Created by joaqu on 25/09/2017.
 */

public class FICLibrasLibras extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fic_libras_libras);
        final Button buttonRepetir = (Button) findViewById(R.id.buttonFICLibrasRepetir);
        buttonRepetir.setOnClickListener(this);
        final Button buttonVoltar = (Button) findViewById(R.id.buttonFICLibrasVoltar);
        buttonVoltar.setOnClickListener(this);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView videoFICLibras = (VideoView)findViewById(R.id.videoViewFICLibras);
        videoFICLibras.setOnClickListener(this);
        String caminho = "android.resource://project.org.com.acessif/"+R.raw.curso_fic_libras;
        Uri uri = Uri.parse(caminho);
        videoFICLibras.setVideoURI(uri);
        videoFICLibras.requestFocus();
        videoFICLibras.start();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonFICLibrasRepetir: {
                repetir(v);
                break;
            }
            case R.id.buttonFICLibrasVoltar: {
                voltar(v);
                break;
            }
        }
    }
    public void voltar (View view){
        Intent intent = new Intent(FICLibrasLibras.this, FICLibras.class);
        startActivity(intent);
    }
    public void repetir (View view){
        Intent intent = new Intent(FICLibrasLibras.this, FICLibrasLibras.class);
        startActivity(intent);
    }
}
