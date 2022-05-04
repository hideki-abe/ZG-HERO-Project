package controller

import model.competencia.Competencia
import model.dao.competencia.CompetenciaDAO
import model.factory.competencia.CompetenciaCC

class CompetenciaController {

    CompetenciaDAO compDAO = new CompetenciaCC().createCompetencia()

    void imprime(){
        println compDAO.listar()
    }

    void insere(Competencia comp){
        compDAO.inserir(comp)
    }

    void altera(String nome){
        compDAO.alterar(nome)
    }

    void remove(String nome){
        compDAO.remover(nome)
    }
}
