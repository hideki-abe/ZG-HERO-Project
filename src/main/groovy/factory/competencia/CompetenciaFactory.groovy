package factory.competencia

import dao.competencias.CompetenciaDAO

abstract class CompetenciaFactory {

    abstract CompetenciaDAO createCompetencia()

}
