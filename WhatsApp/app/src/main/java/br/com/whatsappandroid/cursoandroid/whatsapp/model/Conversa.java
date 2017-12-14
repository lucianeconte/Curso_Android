package br.com.whatsappandroid.cursoandroid.whatsapp.model;

public class Conversa {

    private String idUsuario;
    private String nomeUsuario;
    private String mensagem;

    public Conversa() {
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nomeUsuario;
    }

    public void setNome(String nome) {
        this.nomeUsuario = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}