package project.org.com.acessif;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joaqu on 18/09/2017.
 */

public class AssistenciaLibras extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assistencia_libras);
        final Button buttonRepetirA = (Button) findViewById(R.id.buttonRepetirA);
        buttonRepetirA.setOnClickListener(this);
        final Button buttonVoltarALibras = (Button) findViewById(R.id.buttonVoltarALibras);
        buttonVoltarALibras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonRepetirA: {
                RepetirA(v);
                break;
            }
            case R.id.buttonVoltarALibras:{
                VoltarALibras(v);
                break;
            }
        }

    }
    public void VoltarALibras (View view){
        Intent intent = new Intent(AssistenciaLibras.this, Libras.class);
        startActivity(intent);
    }
    public void RepetirA (View view){
        Intent intent = new Intent(AssistenciaLibras.this, AssistenciaLibras.class);
    }
}

