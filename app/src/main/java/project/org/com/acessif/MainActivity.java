package project.org.com.acessif;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
