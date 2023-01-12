package main;

public class Cientista implements Pessoa {

    private String ID;
    private String nome;
    private String titulacao;

    public Cientista(String ID, String nome, String titulacao) {
        this.ID = ID;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public String getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCientista(this);
    }
}
