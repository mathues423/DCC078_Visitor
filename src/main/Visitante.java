package main;

import java.util.Date;

public class Visitante implements Pessoa{

    private String ID;
    private String nome;

    private Date entrada;

    public Visitante(String ID, String nome, Date entrada) {
        this.ID = ID;
        this.nome = nome;
        this.entrada = entrada;
    }

    public String getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public Date getEntrada() {
        return entrada;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirVisitante(this);
    }
}
