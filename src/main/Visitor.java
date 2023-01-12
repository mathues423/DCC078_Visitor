package main;

public interface Visitor {

    String exibirVisitante(Visitante visitante);

    String exibirCientista(Cientista cientista);

    String exibirGuarda(Guarda guarda);
}
