package mx.edu.tesoem.isc.eijd.p3eijd;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent edi=new Intent(MainActivity.this,FrmPrincipalActivity.class);
                startActivity(edi);
                finish();

            }
        },5000);
    }
}
