package factory.vaga

import dao.vaga.JDBCVagaDAO
import dao.vaga.VagaDAO

class VagaCC extends VagaFactory{

    @Override
    VagaDAO createVagas() {
        return new JDBCVagaDAO()
    }
}
