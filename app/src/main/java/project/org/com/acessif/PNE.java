package project.org.com.acessif;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joaqu on 28/08/2017.
 */

public class PNE extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pne);
        Button buttonLibras = (Button) findViewById(R.id.buttonLibras);
        buttonLibras.setOnClickListener(this);
        Button buttonFone = (Button) findViewById(R.id.ButtonFone);
        buttonFone.setOnClickListener(this);
        Button buttonVoz = (Button) findViewById(R.id.ButtonVoz);
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
            case R.id.ButtonFone: {
                AcessoFone(v);
                break;
            }
            case R.id.buttonLibras: {
                AcessoLibras(v);
                break;
            }
            case R.id.ButtonVoz: {
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
