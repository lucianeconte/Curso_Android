package sqlite.cursoandroid.com.sqlite;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            SQLiteDatabase bancoDados = openOrCreateDatabase("app", MODE_PRIVATE, null);

            //Tabela
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas(id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3) ) ");

            //Inserir dados
           // bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Eliézer', 32) ");
            //bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Ana', 10) ");
            //bancoDados.execSQL("UPDATE pessoas SET idade = 11 WHERE nome = 'Ana'");
            //bancoDados.execSQL("DROP TABLE pessoas");

            //Recuperar dados
            Cursor cursor = bancoDados.rawQuery("SELECT * FROM pessoas", null);
            //WHERE nome LIKE 'lu%'

            int indiceColunaId = cursor.getColumnIndex("id");
            int indiceColunaNome = cursor.getColumnIndex("nome");
            int indiceColunaIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();

            while (cursor != null){

                Log.i("Resultado - id: ", cursor.getString(indiceColunaId));
                Log.i("Resultado - nome: ", cursor.getString(indiceColunaNome));
                Log.i("Resultado - idade: ", cursor.getString(indiceColunaIdade));
                cursor.moveToNext();

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
