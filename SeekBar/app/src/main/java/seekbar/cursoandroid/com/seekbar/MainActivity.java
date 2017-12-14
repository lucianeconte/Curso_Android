package seekbar.cursoandroid.com.seekbar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private SeekBar seekbar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = (SeekBar) findViewById(R.id.seekBarId);
        textoExibicao = (TextView) findViewById(R.id.textoExibicaoId);


        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //Método chamaddo quando movimenta o SeekBar
                textoExibicao.setText("Progresso: " + i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Método chamado quando pressiona o SeekBar
                Toast.makeText(MainActivity.this, "SeekBar pressionado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Método chamado quando solta o SeekBar
                Toast.makeText(MainActivity.this, "Salvar o valor do SeekBar", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
