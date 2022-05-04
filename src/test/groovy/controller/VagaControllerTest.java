package controller;

import model.dao.vaga.VagaDAO;
import model.vaga.Vaga;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class VagaControllerTest {

    VagaDAO vagaDAO = mock(VagaDAO.class);

    @Test
    void imprime() {
        System.out.println(vagaDAO.listar());
    }

    @Test
    void insere() {
        Vaga vaga = new Vaga();
        vaga.setNome("Programador");
        vagaDAO.inserir(vaga);

    }

    @Test
    void altera() {
        Vaga vaga = new Vaga();
        vaga.setNome("Especialista");
        vagaDAO.alterar(vaga, "Programador");
    }

    @Test
    void remove() {
        vagaDAO.remover("Programador");
    }
}