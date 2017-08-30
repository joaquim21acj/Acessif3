package project.org.com.acessif;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSemAjuda = (Button) findViewById(R.id.buttonSemDeficiencia);
        buttonSemAjuda.setOnClickListener(this);
        Button buttonAditiva = (Button) findViewById(R.id.buttonAuditiva);
        buttonAditiva.setOnClickListener(this);
        Button buttonVisual = (Button) findViewById(R.id.buttonSemDeficiencia);
        buttonVisual.setOnClickListener(this);
        Button buttonAtencao = (Button) findViewById(R.id.buttonAtencao);
        buttonAtencao.setOnClickListener(this);
    }

    public void telaSemAjuda (View view){
        Intent intent = new Intent(MainActivity.this, SemAjuda.class);
        startActivity(intent);
    }
    public void telaAuditiva (View view){
        Intent intent = new Intent(MainActivity.this, Auditiva.class);
        startActivity(intent);
    }
    public void telaVisual (View view){
        Intent intent = new Intent(MainActivity.this, Visual.class);
        startActivity(intent);
    }

    public void telaAtencao (View view){
        Intent intent = new Intent(MainActivity.this, Atencao.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonSemDeficiencia: {
                telaSemAjuda(v);
                break;
            }
        }
    }
}
