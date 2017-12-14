package br.com.whatsappandroid.cursoandroid.whatsapp.model;

public class Contato {

    private String identificadorUsuario;
    private String nomeUsuario;
    private String email;

    public Contato() {
    }

    public String getIdentificadorUsuario() {
        return identificadorUsuario;
    }

    public void setIdentificadorUsuario(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }

    public String getNome() {
        return nomeUsuario;
    }

    public void setNome(String nome) {
        this.nomeUsuario = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
