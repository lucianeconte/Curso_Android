package dadosactivity.cursoandroid.com.dadosactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = (TextView) findViewById(R.id.textoId);

        //Recuparar informções passada na activitymain
        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String textoPasado = extra.getString("nome");
            texto.setText(textoPasado);
        }
    }
}
