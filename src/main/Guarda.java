package main;

public class Guarda implements Pessoa{
    private String ID;
    private String nome;

    public Guarda(String ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirGuarda(this);
    }
}
