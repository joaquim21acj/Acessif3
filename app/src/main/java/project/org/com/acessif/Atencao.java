package project.org.com.acessif;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joaqu on 28/08/2017.
 */

public class Atencao extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSemAjuda = (Button) findViewById(R.id.buttonSemDeficiencia);
        buttonSemAjuda.setOnClickListener(this);
        Button buttonAditiva = (Button) findViewById(R.id.buttonAuditiva);
        buttonAditiva.setOnClickListener(this);
        Button buttonVisual = (Button) findViewById(R.id.buttonVisual);
        buttonVisual.setOnClickListener(this);
        Button buttonAtencao = (Button) findViewById(R.id.buttonAtencao);
        buttonAtencao.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.buttonSemDeficiencia: {
                    telaSemAjuda(v);
                    break;
                }
                case R.id.buttonAuditiva: {
                    telaAuditiva(v);
                    break;
                }
                case R.id.buttonAtencao: {
                    telaAtencao(v);
                    break;
                }
                case R.id.buttonVisual: {
                    telaVisual(v);
                    break;
                }
            }
        }

}
