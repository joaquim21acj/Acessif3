package project.org.com.acessif;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joaqu on 16/09/2017.
 */

public class CursosLibras extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cursos_libras);
        final Button buttonCTecnicos = (Button) findViewById(R.id.buttonCTecnicos);
        buttonCTecnicos.setOnClickListener(this);
        final Button buttonTecno = (Button) findViewById(R.id.buttonTecnologo);
        buttonTecno.setOnClickListener(this);
        final Button buttonLic = (Button) findViewById(R.id.buttonLicenciatura);
        buttonLic.setOnClickListener(this);
        final Button buttonFIC = (Button) findViewById(R.id.buttonFIC);
        buttonFIC.setOnClickListener(this);
        final Button buttonVoltarCLibras = (Button) findViewById(R.id.buttonVoltarCLibras);
        buttonVoltarCLibras.setOnClickListener(this);
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
                VoltarCursos(v);
                break;
            }
        }

    }
    public void CTecnicosLibras (View view){
        Intent intent = new Intent(CursosLibras.this, TecnicosLibra.class);
        startActivity(intent);
    }
    public void TecnoLibras (View view){
        Intent intent = new Intent(CursosLibras.this, TecnoLibras.class);
        startActivity(intent);
    }
    public void LicLibras (View view){
        Intent intent = new Intent(CursosLibras.this, LicenciaturaLibras.class);
        startActivity(intent);
    }

    public void FICLibras (View view){
        Intent intent = new Intent(CursosLibras.this, FICLibras.class);
        startActivity(intent);
    }
    public void VoltarCursos (View view){
        Intent intent = new Intent(CursosLibras.this, Libras.class);
    }
}
