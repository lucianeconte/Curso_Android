package com.cursoandroid.autenticacaousuario.autenticacaousuario;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        //Login do usuário
        /* firebaseAuth.signInWithEmailAndPassword("luciteste@gmail.com", "senha123")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) { //Sucesso ao logar
                            Log.i("signIn", "Sucesso ao fazer o login usuário!");
                        } else { //Erro ao logar
                            Log.i("signIn", "Erro ao logar o usuário!" + task.getException());
                        }
                    }
                });*/


        //Deslogar usuário
        firebaseAuth.signOut();

        if (firebaseAuth.getCurrentUser() != null) {
            Log.i("verificaUsuario", "Usuário já está logado");

        }else {
            Log.i("verificaUsuario", "Usuário não está logado");
        }


        //Cadastro do usuário
       /* firebaseAuth.createUserWithEmailAndPassword("emailteste2@gmail.com", "senha123456")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) { //Sucesso ao cadastrar usuário
                            Log.i("createUser", "Sucesso ao cadastrar usuário!");
                        } else { //Erro ao cadastrar usuário
                            Log.i("createUser", "xErro ao cadastrar usuário! " + task.getException());
                        }
                    }
                });*/
    }
}
