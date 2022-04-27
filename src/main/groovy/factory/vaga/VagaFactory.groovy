package factory.vaga

import dao.vaga.VagaDAO

abstract class VagaFactory {

    abstract VagaDAO createVagas()

}
