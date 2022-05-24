package model.factory.pessoas

import model.dao.JDBCPessoaJuridicaDAO
import model.dao.PessoaDAO

class PessoaJuridicaCC extends PessoaFactory{

    @Override
    PessoaDAO createPessoa() {
        return new JDBCPessoaJuridicaDAO()
    }
}
