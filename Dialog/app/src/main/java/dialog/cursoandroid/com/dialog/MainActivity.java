package dialog.cursoandroid.com.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.buttonId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Criar o AlertDialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //Configurar o título
                dialog.setTitle("Título da dialog");

                //Configurar a mensgem
                dialog.setMessage("Mensagem");

                //não permitir cancelar o digalog se clicar fora
                dialog.setCancelable(false);

                //Icone do dialog
                dialog.setIcon(android.R.drawable.ic_delete);

                //Configurar botão negativo, descrição e ação
                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "Pressionado o botão não", Toast.LENGTH_SHORT).show();
                            }
                        });

                //Configurar botão negativo, descrição e ação
                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "Pressionado o botão sim", Toast.LENGTH_SHORT).show();
                            }
                        });

                dialog.create();
                dialog.show();

            }
        });
    }
}
