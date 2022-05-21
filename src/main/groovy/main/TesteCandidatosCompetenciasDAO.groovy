package main

import model.dao.candidatosCompetencias.CandidatosCompetenciasDAO
import model.dao.candidatosCompetencias.JDBCCandidatosCompetenciasDAO
import model.factory.candidatosCompetencias.CandidatosCompetenciasCC
import model.factory.candidatosCompetencias.CandidatosCompetenciasFactory

class TesteCandidatosCompetenciasDAO {

    static void main(String[] args) {

        //ENCONTRA OS IDS DAS COMPETÊNCIAS PELO ID DO CANDIDATO
        println(findById(1))

    }

    static ArrayList findById(int id){
        CandidatosCompetenciasDAO comp = new CandidatosCompetenciasCC().createCandidatosCompetencias()
        return comp.findById(id)
    }


}
