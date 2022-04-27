package factory.pessoas

import dao.pessoas.JDBCPessoaFisicaDAO
import dao.pessoas.PessoaDAO

class PessoaFisicaCC extends PessoaFactory{

    @Override
    PessoaDAO createPessoa() {
        return new JDBCPessoaFisicaDAO()
    }
}
