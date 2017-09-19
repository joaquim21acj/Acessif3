package project.org.com.acessif;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonCursosLibras: {
                CursosLibras(v);
                break;
            }
            case R.id.buttonBibliotecaLibras: {
                BibliotecaLibras(v);
                break;
            }
            case R.id.buttonAssistenciaLibras: {
                AcessoVoz(v);
                break;
            }
            case R.id.buttonOutrosCampiLibras:{
                Voltar(v);
                break;
            }
            case R.id.buttonVoltarLibras:{
                break;
            }
        }

    }
    public void CursosLibras (View view){
        Intent intent = new Intent(Libras.this, CursosLibras.class);
        startActivity(intent);
    }
    public void BibliotecaLibras (View view){
        Intent intent = new Intent(Libras.this, BibliotecaLibras.class);
        startActivity(intent);
    }
    public void AcessoVoz (View view){
        Intent intent = new Intent(Libras.this, Voz.class);
        startActivity(intent);
    }
    public void Voltar (View view){
        Intent intent = new Intent(Libras.this, PNE.class);
        startActivity(intent);
    }
}
