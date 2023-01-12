package teste;

import main.Cientista;
import main.Guarda;
import main.PessoaVisitor;
import main.Visitante;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {
    @Test
    void deveExibirGuarda() {
        Guarda guarda = new Guarda("2512AG","Tadeu");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Visitante:{" +
                "ID: 2512AG\'" +
                "Nome: Tadeu\'" +
                "}", visitor.exibir(guarda));
    }

    @Test
    void deveExibirCientista() {
        Cientista cientista = new Cientista("2512AC", "Maria", "Doutorado");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Visitante:{" +
                "ID: 2512AC\'" +
                "Nome: Maria\'" +
                "Titulação: Doutorado\'" +
                "}", visitor.exibir(cientista));
    }

    @Test
    void deveExibirVisitante() {
        Visitante visitante = new Visitante("1", "Pedro", new Date());

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Visitante:{" +
                "ID: 1\'" +
                "Nome: Pedro\'" +
                "Data de Entrada: "+ visitante.getEntrada()+"\'" +
                "}", visitor.exibir(visitante));
    }
}