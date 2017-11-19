package project.org.com.acessif;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by joaqu on 28/08/2017.
 */

public class PNE extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pne);
        ImageButton buttonLibras = (ImageButton) findViewById(R.id.imageButtonLibras);
        buttonLibras.setOnClickListener(this);
        ImageButton buttonFone = (ImageButton) findViewById(R.id.imageButtonFone);
        buttonFone.setOnClickListener(this);
        ImageButton buttonVoz = (ImageButton) findViewById(R.id.imageButtonVoz);
        buttonVoz.setOnClickListener(this);
        Button buttonVoltarPNE = (Button) findViewById(R.id.buttonVoltarPNE);
        buttonVoltarPNE.setOnClickListener(this);
    }

    public void AcessoLibras (View view){
        Intent intent = new Intent(PNE.this, Libras.class);
        startActivity(intent);
    }
    public void AcessoFone (View view){
        Intent intent = new Intent(PNE.this, Fone.class);
        startActivity(intent);
    }
    public void AcessoVoz (View view){
        Intent intent = new Intent(PNE.this, Voz.class);
        startActivity(intent);
    }
    public void Voltar (View view){
        Intent intent = new Intent(PNE.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonFone: {
                AcessoFone(v);
                break;
            }
            case R.id.imageButtonLibras: {
                AcessoLibras(v);
                break;
            }
            case R.id.imageButtonVoz: {
                AcessoVoz(v);
                break;
            }
            case R.id.buttonVoltarPNE:{
                Voltar(v);
                break;
            }
        }
    }
}
