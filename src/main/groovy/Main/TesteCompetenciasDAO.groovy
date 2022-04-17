package Main

import Competencias.Competencia
import DAO.CompetenciasDAO

class TesteCompetenciasDAO {

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
        CompetenciasDAO compDAO = new CompetenciasDAO()
        println(compDAO.listar())
    }

    def static inserir(Competencia comp){
        CompetenciasDAO compDAO = new CompetenciasDAO()
        compDAO.inserir(comp)
    }

    def static altera(Competencia comp, String nome){
        CompetenciasDAO compDAO = new CompetenciasDAO()
        compDAO.alterar(comp, nome)
    }

    def static remove(String nome){
        CompetenciasDAO compDAO = new CompetenciasDAO()
        compDAO.remover(nome)
    }

}
