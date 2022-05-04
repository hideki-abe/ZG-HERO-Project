package controller;

import model.dao.pessoas.PessoaDAO;
import static org.mockito.Mockito.*;

import model.pessoas.PessoaFisica;
import model.pessoas.PessoaJuridica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaFisicaControllerTest {

    PessoaDAO candidatoDAO = mock(PessoaDAO.class);

    @Test
    void imprime() {
        System.out.println(candidatoDAO.listar());
    }

    @Test
    void insere() {
        PessoaFisica candidato = new PessoaFisica();
        candidato.setNome("João");
        candidatoDAO.inserir(candidato);
    }

    @Test
    void altera() {
        PessoaFisica candidato = new PessoaFisica();
        candidatoDAO.alterar(candidato, "123456789");

    }

    @Test
    void remove() {
        candidatoDAO.remover("123456789");
    }
}