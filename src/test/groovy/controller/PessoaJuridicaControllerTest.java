package controller;

import model.dao.pessoas.PessoaDAO;
import model.pessoas.PessoaJuridica;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class PessoaJuridicaControllerTest {

    PessoaDAO empresaDAO = mock(PessoaDAO.class);

    @Test
    void imprime() {
        System.out.println(empresaDAO.listar());
    }

    @Test
    void insere() {
        PessoaJuridica empresa = new PessoaJuridica();
        empresa.setNome("Amazon");
        empresaDAO.alterar(empresa, "123456789");
    }

    @Test
    void altera() {
        PessoaJuridica empresa = new PessoaJuridica();
        empresaDAO.alterar(empresa, "123456789");
    }

    @Test
    void remove() {
        empresaDAO.remover("123456789");
    }
}