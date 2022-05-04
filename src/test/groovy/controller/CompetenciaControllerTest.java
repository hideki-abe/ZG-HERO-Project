package controller;

import model.competencia.Competencia;
import model.dao.competencia.CompetenciaDAO;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CompetenciaControllerTest {

    CompetenciaDAO compDAO = mock(CompetenciaDAO.class);

    @Test
    void imprime() {
        System.out.println(compDAO.listar());
    }

    @Test
    void insere() {
        Competencia comp = new Competencia("React");
        compDAO.inserir(comp);
    }

    @Test
    void altera() {
        Competencia comp = new Competencia("Java");
        compDAO.alterar(comp, "React");
    }

    @Test
    void remove() {
        compDAO.remover("Java");
    }
}