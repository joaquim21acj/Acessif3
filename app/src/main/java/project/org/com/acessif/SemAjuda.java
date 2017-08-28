package project.org.com.acessif;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by joaqu on 28/08/2017.
 */

public class SemAjuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sem_ajuda);
    }
    public void outrosCampi (){
        Intent intent = new Intent(SemAjuda.this, OutrosCampi.class);
        startActivity(intent);
    }
    public void voltar (View view){
        Intent intent = new Intent(SemAjuda.this, MainActivity.class);
        startActivity(intent);
    }
    public void cursos(){
        Intent intent = new Intent(SemAjuda.this, Cursos.class);
        startActivity(intent);
    }
    public void biblioteca(){
        Intent intent = new Intent(SemAjuda.this, Biblioteca.class);
        startActivity(intent);
    }
    public void assitencia(){
        Intent intent = new Intent(SemAjuda.this, Assistencia.class);
        startActivity(intent);
    }



}
