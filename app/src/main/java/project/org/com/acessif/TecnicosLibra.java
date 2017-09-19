package project.org.com.acessif;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joaqu on 16/09/2017.
 */

public class TecnicosLibra extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tecnicos_libras);
        final Button buttonTecAliLibras = (Button) findViewById(R.id.buttonTecAliLibras);
        buttonTecAliLibras.setOnClickListener(this);
        final Button buttonTecAdmLibras = (Button) findViewById(R.id.buttonTecAdmLibras);
        buttonTecAdmLibras.setOnClickListener(this);
        final Button buttonTecLogLibras = (Button) findViewById(R.id.buttonTecLogLibras);
        buttonTecLogLibras.setOnClickListener(this);
        final Button buttonTecQuiLibras = (Button) findViewById(R.id.buttonTecQuiLibras);
        buttonTecQuiLibras.setOnClickListener(this);
        final Button buttonVoltarTecLibras = (Button) findViewById(R.id.buttonTecVoltarLibras);
        buttonVoltarTecLibras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonCTecnicos: {
                CTecnicosLibras(v);
                break;
            }
            case R.id.buttonTecnologo: {
                TecnoLibras(v);
                break;
            }
            case R.id.buttonLicenciatura: {
                LicLibras(v);
                break;
            }
            case R.id.buttonFIC:{
                FICLibras(v);
                break;
            }
            case R.id.buttonVoltarLibras:{
                VoltarTecLibras(v);
                break;
            }
        }

    }
    public void CTecnicosLibras (View view){
        Intent intent = new Intent(TecnicosLibra.this, TecnicosLibra.class);
        startActivity(intent);
    }
    public void TecnoLibras (View view){
        Intent intent = new Intent(TecnicosLibra.this, TecnoLibras.class);
        startActivity(intent);
    }
    public void LicLibras (View view){
        Intent intent = new Intent(TecnicosLibra.this, LicenciaturaLibras.class);
        startActivity(intent);
    }

    public void FICLibras (View view){
        Intent intent = new Intent(TecnicosLibra.this, TecnicosLibra.class);
        startActivity(intent);
    }
    public void VoltarTecLibras (View view){
        Intent intent = new Intent(TecnicosLibra.this, CursosLibras.class);
    }

}
