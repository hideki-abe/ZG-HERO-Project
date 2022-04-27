package main

import dao.competencias.CompetenciaDAO
import factory.competencia.CompetenciaCC
import model.Competencia.Competencia

class TesteCompetenciaDAO {

    static void main(String[] args) {

        //LISTA COMPETENCIAS
        listar()

        //INSERE COMPETENCIAS
        Competencia comp = new Competencia("Python")
        inserir(comp)

        //ALTERA COMPETENCIAS
        comp.nome = "Ruby"
        alterar(comp, "Python")

        //REMOVE COMPETENCIAS
        remover("Ruby")


    }

    def static listar(){
        CompetenciaDAO compDAO = new CompetenciaCC().createCompetencia()
        println(compDAO.listar())
    }

    def static inserir(Competencia comp){
        CompetenciaDAO compDAO = new CompetenciaCC().createCompetencia()
        compDAO.inserir(comp)
    }

    def static alterar(Competencia comp, String nome){
        CompetenciaDAO compDAO = new CompetenciaCC().createCompetencia()
        compDAO.alterar(comp, nome)
    }

    def static remover(String nome){
        CompetenciaDAO compDAO = new CompetenciaCC().createCompetencia()
        compDAO.remover(nome)
    }

}
