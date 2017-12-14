package togglebutton.cursoandroid.com.togglebutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    private ToggleButton toogleButton;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toogleButton = (ToggleButton) findViewById(R.id.toggleButtonId);
        textoExibicao = (TextView) findViewById(R.id.textoExibicaoId);

        toogleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                textoExibicao.setText("");
                if (b){
                    textoExibicao.setText("Mostrar...");
                }
            }
        });
    }
}
