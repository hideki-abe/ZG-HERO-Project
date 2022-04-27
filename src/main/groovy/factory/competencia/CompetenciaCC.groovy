package factory.competencia

import dao.competencias.CompetenciaDAO
import dao.competencias.JDBCCompetenciaDAO

class CompetenciaCC extends CompetenciaFactory{

    @Override
    CompetenciaDAO createCompetencia() {
        return new JDBCCompetenciaDAO()
    }
}
