package model.factory.pessoas


import model.dao.pessoas.PessoaDAO
import model.dao.pessoas.JDBCPessoaFisicaDAO

class PessoaFisicaCC extends PessoaFactory{

    @Override
    PessoaDAO createPessoa() {
        return new JDBCPessoaFisicaDAO()
    }
}
