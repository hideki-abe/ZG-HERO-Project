package main

import dao.competencias.CompetenciaDAO
import factory.competencia.CompetenciaCC
import model.Competencias.Competencia
import dao.competencias.JDBCCompetenciaDAO

class TesteCompetenciaDAO {

    static void main(String[] args) {

        //LISTA COMPETENCIAS
        lista()

        //INSERE COMPETENCIAS
        Competencia comp = new Competencia("Python")
        inserir(comp)

        //ALTERA COMPETENCIAS
        comp.nome = "Ruby"
        altera(comp, "Python")

        //REMOVE COMPETENCIAS
        remove("Ruby")


    }

    def static lista(){
        CompetenciaDAO compDAO = new CompetenciaCC().createCompetencia()
        println(compDAO.listar())
    }

    def static inserir(Competencia comp){
        CompetenciaDAO compDAO = new CompetenciaCC().createCompetencia()
        compDAO.inserir(comp)
    }

    def static altera(Competencia comp, String nome){
        CompetenciaDAO compDAO = new CompetenciaCC().createCompetencia()
        compDAO.alterar(comp, nome)
    }

    def static remove(String nome){
        CompetenciaDAO compDAO = new CompetenciaCC().createCompetencia()
        compDAO.remover(nome)
    }

}
