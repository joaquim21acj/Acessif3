package project.org.com.acessif;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joaqu on 17/09/2017.
 */

public class BibliotecaLibras extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biblioteca_libras);
        final Button buttonReplayBiblioteca = (Button) findViewById(R.id.buttonRepetirBiblioteca);
        buttonReplayBiblioteca.setOnClickListener(this);
        final Button buttonVoltarBLibras = (Button) findViewById(R.id.buttonVoltarrBLibras);
        buttonVoltarBLibras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonRepetirBiblioteca: {
                Repetir(v);
                break;
            }
            case R.id.buttonVoltarrBLibras: {
                Voltar(v);
                break;
            }
        }

    }
    public void Repetir (View view){
        Intent intent = new Intent(BibliotecaLibras.this, BibliotecaLibras.class);
        startActivity(intent);
    }

    public void Voltar (View view){
        Intent intent = new Intent(BibliotecaLibras.this, Libras.class);
    }
}
