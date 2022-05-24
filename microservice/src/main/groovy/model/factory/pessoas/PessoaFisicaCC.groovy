package model.factory.pessoas

import model.dao.JDBCPessoaFisicaDAO
import model.dao.PessoaDAO

class PessoaFisicaCC extends PessoaFactory{

    @Override
    PessoaDAO createPessoa() {
        return new JDBCPessoaFisicaDAO()
    }
}
