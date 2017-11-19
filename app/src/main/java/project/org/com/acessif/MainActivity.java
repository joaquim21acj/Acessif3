package project.org.com.acessif;

//import android.content.Intent;
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
        Button buttonPNE = (Button) findViewById(R.id.buttonPNE);
        buttonPNE.setOnClickListener(this);
        Button buttonSemAjuda = (Button) findViewById(R.id.buttonAcessoDireto);
        buttonSemAjuda.setOnClickListener(this);
    }

    public void acessoDireto (View view){
        Intent intent = new Intent(MainActivity.this, SemAjuda.class);
        startActivity(intent);
    }
    public void acessoPNE (View view){
        Intent intent = new Intent(MainActivity.this, PNE.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonPNE: {
                acessoPNE(v);
                break;
            }
            case R.id.buttonAcessoDireto:{
                acessoDireto(v);
                break;
            }
        }
    }
}
