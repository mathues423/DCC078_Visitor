package main;

public class PessoaVisitor implements Visitor{

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirVisitante(Visitante visitante) {
        return "Visitante:{" +
                "ID: "+ visitante.getID()+"\'" +
                "Nome: "+ visitante.getNome()+"\'" +
                "Data de Entrada: "+ visitante.getEntrada()+"\'" +
                "}";
    }

    @Override
    public String exibirCientista(Cientista cientista) {
        return "Visitante:{" +
                "ID: "+ cientista.getID()+"\'" +
                "Nome: "+ cientista.getNome()+"\'" +
                "Titulação: "+ cientista.getTitulacao()+"\'" +
                "}";
    }

    @Override
    public String exibirGuarda(Guarda guarda) {
        return "Visitante:{" +
                "ID: "+ guarda.getID()+"\'" +
                "Nome: "+ guarda.getNome()+"\'" +
                "}";
    }
}
