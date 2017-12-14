package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String[] signos = {
            "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem",
            "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário",
            "Peixes"
    };

    private String[] perfis = {
            "Áries - texto com seu perfil", "Touro - texto com seu perfil",
            "Gêmeos - texto com seu perfil", "Câncer - texto com seu perfil",
            "Leão - texto com seu perfil", "Virgem - texto com seu perfil",
            "Libra - texto com seu perfil", "Escorpião - texto com seu perfil",
            "Sagitário - texto com seu perfil", "Capricórnio - texto com seu perfil",
            "Aquário - texto com seu perfil", "Peixes - texto com seu perfil"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigoPosicao = i;
                Toast.makeText(getApplicationContext(), perfis[codigoPosicao], Toast.LENGTH_LONG).show();
            }
        });

    }
}
