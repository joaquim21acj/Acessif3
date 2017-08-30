package project.org.com.acessif;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joaqu on 28/08/2017.
 */

public class SemAjuda extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sem_ajuda);
        Button buttonCampi = (Button) findViewById(R.id.buttonCampi);
        buttonCampi.setOnClickListener(this);
        Button buttonVoltar = (Button) findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(this);
        Button buttonCursos = (Button) findViewById(R.id.buttonCursos);
        buttonCursos.setOnClickListener(this);
        Button buttonBiblioteca = (Button) findViewById(R.id.buttonBiblioteca);
        buttonBiblioteca.setOnClickListener(this);
        Button buttonAssistencia = (Button) findViewById(R.id.buttonAssistencia);
        buttonAssistencia.setOnClickListener(this);
    }
    @Override
    public void onClick (View v) {
        switch (v.getId()){
            case R.id.buttonCampi: {
                outrosCampi(v);
                break;
            }
            case R.id.buttonVoltar: {
                voltar(v);
                break;
            }

        }
    }
    public void outrosCampi (View view){
        Intent intent = new Intent(SemAjuda.this, OutrosCampi.class);
        startActivity(intent);
    }
    public void voltar (View view){
        Intent intent = new Intent(SemAjuda.this, MainActivity.class);
        startActivity(intent);
    }
    public void cursos(){
        Intent intent = new Intent(SemAjuda.this, Cursos.class);
        startActivity(intent);
    }
    public void biblioteca(){
        Intent intent = new Intent(SemAjuda.this, Biblioteca.class);
        startActivity(intent);
    }
    public void assitencia(){
        Intent intent = new Intent(SemAjuda.this, Assistencia.class);
        startActivity(intent);
    }



}
